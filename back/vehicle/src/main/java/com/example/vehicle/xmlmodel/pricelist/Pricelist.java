//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.19 at 12:24:49 AM CEST 
//


package com.example.vehicle.xmlmodel.pricelist;


import com.example.vehicle.xmlmodel.pricelist.vehicle_discount.VehicleDiscount;

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
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="priceByMile" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="priceCollision" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element ref="{http://rentacar.com/vehicle-discount}vehicleDiscount"/>
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
    "startDate",
    "endDate",
    "price",
    "priceByMile",
    "priceCollision",
    "vehicleId",
    "vehicleDiscount"
})
@XmlRootElement(name = "schemas/pricelist")
public class Pricelist {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected float price;
    protected float priceByMile;
    protected float priceCollision;
    protected long vehicleId;
    @XmlElement(namespace = "http://rentacar.com/vehicle-discount", required = true)
    protected VehicleDiscount vehicleDiscount;

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
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceByMile property.
     * 
     */
    public float getPriceByMile() {
        return priceByMile;
    }

    /**
     * Sets the value of the priceByMile property.
     * 
     */
    public void setPriceByMile(float value) {
        this.priceByMile = value;
    }

    /**
     * Gets the value of the priceCollision property.
     * 
     */
    public float getPriceCollision() {
        return priceCollision;
    }

    /**
     * Sets the value of the priceCollision property.
     * 
     */
    public void setPriceCollision(float value) {
        this.priceCollision = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     */
    public long getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     */
    public void setVehicleId(long value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the vehicleDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDiscount }
     *     
     */
    public VehicleDiscount getVehicleDiscount() {
        return vehicleDiscount;
    }

    /**
     * Sets the value of the vehicleDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDiscount }
     *     
     */
    public void setVehicleDiscount(VehicleDiscount value) {
        this.vehicleDiscount = value;
    }

    @Override
    public String toString() {
        return "Pricelist{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                ", priceByMile=" + priceByMile +
                ", priceCollision=" + priceCollision +
                ", vehicleId=" + vehicleId +
                ", vehicleDiscount=" + vehicleDiscount +
                '}';
    }

    public com.example.vehicle.dto.pricelist.Pricelist toModel(Pricelist pricelist){
        com.example.vehicle.dto.pricelist.Pricelist pricelistModel = new com.example.vehicle.dto.pricelist.Pricelist();
        pricelistModel.setId(pricelist.getId());
        pricelistModel.setPrice(pricelist.getPrice());
        pricelistModel.setPriceByMile(pricelist.getPriceByMile());
        pricelistModel.setPriceCollision(pricelist.getPriceCollision());
        pricelistModel.setStartDate(pricelist.getStartDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
        pricelistModel.setEndDate(pricelist.getEndDate().toGregorianCalendar().toZonedDateTime().toLocalDateTime());

        pricelistModel.setVehicleId(pricelist.getVehicleId());

        com.example.vehicle.dto.pricelist.VehicleDiscount vehicleDiscountModel = new com.example.vehicle.dto.pricelist.VehicleDiscount();

        vehicleDiscountModel.setDiscount(pricelist.getVehicleDiscount().getDiscount());
        vehicleDiscountModel.setId(pricelist.getVehicleDiscount().getId());
        vehicleDiscountModel.setNumDays(pricelist.getVehicleDiscount().getNumDays());

        pricelistModel.setVehicleDiscount(vehicleDiscountModel);

        return pricelistModel;
    }

}
