package com.example.user.controller;

import com.example.user.dto.ChangeUsPwRequestDTO;
import com.example.user.dto.CreateUserRequestDTO;
import com.example.user.dto.LoginRequestDTO;
import com.example.user.dto.UserCreateVehicleDTO;
import com.example.user.dto.UserDTO;
import com.example.user.model.Notification;
import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * GET /user/login
     *
     * @return returns logged in user
     */
    @PostMapping(value = "/loginTest", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> loginTest(@RequestBody LoginRequestDTO loginRequestDTO) throws Exception {
        System.out.println(loginRequestDTO.toString());
        User user = userService.loginTest(loginRequestDTO);
        if (user == null) {
            System.err.println("USER JE NULL");
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    /**
     * GET /user/usernames
     *
     * @return boolean value which indicates user existence
     */
    @GetMapping(value = "/usernames", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UserDTO>> getUsernames() throws Exception {
        System.out.println("-------- tu sam -------");
        List<User> users = userService.getUnblockedUsers();
        System.out.println("-------- useri -------" + users);
        List<UserDTO> usernamesList = userService.convertUserToUserDTO(users);
        System.out.println("-------- usernames -------" + usernamesList);
        return new ResponseEntity<List<UserDTO>>(usernamesList, HttpStatus.OK);
    }


    /**
     * GET /user/userExists
     *
     * @return boolean value which indicates user existence
     */
    @PostMapping(value = "/userExists", consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> userExists(@RequestBody LoginRequestDTO loginRequestDTO) throws Exception {
        Boolean userExists = userService.userExists(loginRequestDTO);
        return new ResponseEntity<Boolean>(userExists, HttpStatus.OK);
    }

    /**
     * GET /user/username/{userId}
     *
     * @return returns username by user id
     */
    @GetMapping(value = "/username/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUsername(@PathVariable Long userId) throws Exception {
        UserDTO userDTO = userService.getUsername(userId);
        return new ResponseEntity<UserDTO>(userDTO, HttpStatus.OK);
    }

    /**
     * GET /user
     *
     * @return returns object of type UserDTO with user id and username
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List> getAllUsers() throws Exception {
        return new ResponseEntity<List>(userService.getAllUsers(), HttpStatus.OK);
    }

    /**
     * GET /user/{id}
     *
     * @return returns object of type UserDTO with user id and username
     */
    @GetMapping(value= "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getOneUser(@PathVariable String id) throws Exception {
        try {
            return new ResponseEntity<UserDTO>(userService.getOneUser(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    /**
     * GET /user/{id}
     *
     * @return returns object of type UserDTO with user id and username
     */
    @GetMapping(value= "/getUserFromAgentApp/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUserFromAgentApp(@PathVariable Long id) throws Exception {
        try {
            return new ResponseEntity<UserDTO>(userService.getUserFromAgentApp(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
    }

    /**
     * POST /user
     *
     * @return returns notification
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Notification> postNewUser(@RequestBody CreateUserRequestDTO createUserRequestDTO) throws Exception {
        try {
            userService.addNewUser(createUserRequestDTO);
            return new ResponseEntity<Notification>(new Notification("User " + createUserRequestDTO.getUsername() + " created.", true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Notification(e.getMessage(), false), HttpStatus.CONFLICT);
        }
    }

    /**
     * PUT /user
     *
     * @return returns notification
     */
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Notification> putUser(@RequestBody ChangeUsPwRequestDTO changeUsPwRequestDTO) throws Exception {
        try {
            userService.changeUsPw(changeUsPwRequestDTO);
            return new ResponseEntity<Notification>(new Notification("User " + changeUsPwRequestDTO.getUsername() + " changed.", true), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new Notification(e.getMessage(), false), HttpStatus.CONFLICT);
        }
    }

    /**
     * DELETE /user/{id}
     *
     * @return returns notification
     */
    @DeleteMapping(value="/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Notification> deleteUser(@PathVariable Long id) throws Exception {
        try {
            boolean hasRequest = userHasRequest(id);
            boolean hasVehicle = userHasVehicle(id);

            if(hasRequest || hasVehicle){
                return new ResponseEntity<Notification>(new Notification("User can't be deleted.", true), HttpStatus.OK);
            }
            else{
                userService.deleteUser(id);
            }

            return new ResponseEntity<Notification>(new Notification("User with id " + id + " deleted.", true), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(new Notification("User id: "+id+"doesn't exist.", false), HttpStatus.CONFLICT);
        } catch (Exception e) {
            return new ResponseEntity<>(new Notification("User id: "+id+"cant be deleted.", false), HttpStatus.CONFLICT);
        }
    }

    public boolean userHasVehicle(Long id) {
        return restTemplate.exchange("http://vehicle/vehicle/canUserDelete/" + id, HttpMethod.GET, null, new ParameterizedTypeReference<Boolean>() {}).getBody();
    }

    public boolean userHasRequest(Long id) {
        return restTemplate.exchange("http://request/request/canUserDelete/" + id, HttpMethod.GET, null, new ParameterizedTypeReference<Boolean>() {}).getBody();
    }

    /**
     * GET /user/canUserCreate/{userId}
     *
     * @return returns true if user can create vehicles
     */
    @GetMapping(value = "canUserCreate/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> createVehicleValidation(@PathVariable Long userId) throws Exception {
        Boolean userInfo = userService.canUserCreate(userId);
        return new ResponseEntity<Boolean>(userInfo, HttpStatus.OK);
    }

    /**
     * PUT /user/updateUserVehicleNumAfterCreate/{userId}
     *
     * @return updates user vehicle number after create
     */
    @PutMapping(value = "updateUserVehicleNumAfterCreate/{userId}", consumes= MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Notification> updateUserVehicleNumAfterCreate(@PathVariable Long userId) throws Exception {
        Notification notification = userService.updateUserVehicleNumAfterCreate(userId);
        return new ResponseEntity<Notification>(notification, HttpStatus.OK);

    }
}
