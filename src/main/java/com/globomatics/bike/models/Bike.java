package com.globomatics.bike.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchasePrice;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    private Date purchaseDate;
    private Boolean contact;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialnumber() {
        return this.serialNumber;
    }

    public void setSerialnumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPurchaseprice() {
        return this.purchasePrice;
    }

    public void setPurchaseprice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchasedate() {
        return this.purchaseDate;
    }

    public void setPurchasedate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Boolean getContact() {
        return this.contact;
    }

    public void isContact(Boolean contact) {
        this.contact = contact;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
