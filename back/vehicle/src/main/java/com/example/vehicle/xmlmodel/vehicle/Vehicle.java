//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.19 at 12:01:42 AM CEST 
//


package com.example.vehicle.xmlmodel.vehicle;

import com.example.vehicle.xmlmodel.vehicle.vehicle_image.VehicleImage;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mileageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collisionProtection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="childrenSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://rentacar.com/vehicle-image}vehicleImage"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fuelTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="makeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="modelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="styleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transmissionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "mileage",
    "mileageLimit",
    "collisionProtection",
    "childrenSeats",
    "vehicleImage",
    "startDate",
    "endDate",
    "fuelTypeId",
    "makeId",
    "modelId",
    "styleId",
    "transmissionId",
    "locationId",
    "userId"
})
@XmlRootElement(name = "vehicle")
public class Vehicle {

    protected long id;
    protected int mileage;
    protected int mileageLimit;
    protected boolean collisionProtection;
    protected int childrenSeats;
    @XmlElement(namespace = "http://rentacar.com/vehicle-image", required = true)
    protected VehicleImage vehicleImage;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected long fuelTypeId;
    protected long makeId;
    protected long modelId;
    protected long styleId;
    protected long transmissionId;
    protected long locationId;
    protected long userId;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     */
    public void setMileage(int value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the mileageLimit property.
     * 
     */
    public int getMileageLimit() {
        return mileageLimit;
    }

    /**
     * Sets the value of the mileageLimit property.
     * 
     */
    public void setMileageLimit(int value) {
        this.mileageLimit = value;
    }

    /**
     * Gets the value of the collisionProtection property.
     * 
     */
    public boolean isCollisionProtection() {
        return collisionProtection;
    }

    /**
     * Sets the value of the collisionProtection property.
     * 
     */
    public void setCollisionProtection(boolean value) {
        this.collisionProtection = value;
    }

    /**
     * Gets the value of the childrenSeats property.
     * 
     */
    public int getChildrenSeats() {
        return childrenSeats;
    }

    /**
     * Sets the value of the childrenSeats property.
     * 
     */
    public void setChildrenSeats(int value) {
        this.childrenSeats = value;
    }

    /**
     * Gets the value of the vehicleImage property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleImage }
     *     
     */
    public VehicleImage getVehicleImage() {
        return vehicleImage;
    }

    /**
     * Sets the value of the vehicleImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleImage }
     *     
     */
    public void setVehicleImage(VehicleImage value) {
        this.vehicleImage = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the fuelTypeId property.
     * 
     */
    public long getFuelTypeId() {
        return fuelTypeId;
    }

    /**
     * Sets the value of the fuelTypeId property.
     * 
     */
    public void setFuelTypeId(long value) {
        this.fuelTypeId = value;
    }

    /**
     * Gets the value of the makeId property.
     * 
     */
    public long getMakeId() {
        return makeId;
    }

    /**
     * Sets the value of the makeId property.
     * 
     */
    public void setMakeId(long value) {
        this.makeId = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     */
    public long getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     */
    public void setModelId(long value) {
        this.modelId = value;
    }

    /**
     * Gets the value of the styleId property.
     * 
     */
    public long getStyleId() {
        return styleId;
    }

    /**
     * Sets the value of the styleId property.
     * 
     */
    public void setStyleId(long value) {
        this.styleId = value;
    }

    /**
     * Gets the value of the transmissionId property.
     * 
     */
    public long getTransmissionId() {
        return transmissionId;
    }

    /**
     * Sets the value of the transmissionId property.
     * 
     */
    public void setTransmissionId(long value) {
        this.transmissionId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", mileage=" + mileage +
                ", mileageLimit=" + mileageLimit +
                ", collisionProtection=" + collisionProtection +
                ", childrenSeats=" + childrenSeats +
                ", vehicleImage=" + vehicleImage +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", fuelTypeId=" + fuelTypeId +
                ", makeId=" + makeId +
                ", modelId=" + modelId +
                ", styleId=" + styleId +
                ", transmissionId=" + transmissionId +
                ", locationId=" + locationId +
                ", userId=" + userId +
                '}';
    }

    public com.example.vehicle.model.Vehicle toModel(Vehicle vehicle){

        com.example.vehicle.model.Vehicle vehicleModel = new com.example.vehicle.model.Vehicle();

        com.example.vehicle.model.VehicleImage image = new com.example.vehicle.model.VehicleImage();
        image.setId(null);
//        image.setId(vehicle.getVehicleImage().getId());
        image.setName(vehicle.getVehicleImage().getName());
        image.setType(vehicle.getVehicleImage().getType());
        image.setPicByte(vehicle.getVehicleImage().getPicByte());

//        vehicleModel.setId(vehicle.getId());
        vehicleModel.setId(null);
        vehicleModel.setChildrenSeats(vehicle.getChildrenSeats());
        vehicleModel.setMileage(vehicle.getMileage());
        vehicleModel.setMileageLimit(vehicle.getMileageLimit());
        vehicleModel.setCollisionProtection(vehicle.collisionProtection);

        vehicleModel.setStartDate(vehicle.getStartDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
        System.err.println(vehicleModel.getStartDate());
        vehicleModel.setEndDate(vehicle.getEndDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());

        vehicleModel.setImage(image);
        vehicleModel.setLocationId(vehicle.getLocationId());
        vehicleModel.setMakeId(vehicle.getMakeId());
        vehicleModel.setStyleId(vehicle.getStyleId());
        vehicleModel.setFuelTypeId(vehicle.getFuelTypeId());
        vehicleModel.setModelId(vehicle.getModelId());
        vehicleModel.setUserId(vehicle.getUserId());
        vehicleModel.setTransmissionId(vehicle.getTransmissionId());

        return vehicleModel;
    }

}
