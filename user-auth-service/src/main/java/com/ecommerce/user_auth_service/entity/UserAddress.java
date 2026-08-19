package com.ecommerce.user_auth_service.entity;

import jakarta.persistence.*;

import java.util.UUID;
@Entity
@Table(name="user_addresses")
public class UserAddress {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name="recipient_name")
    private String recipientName;
    private String phone;
    @Column(name="address_line1")
    private String addressLine1;
    @Column(name="address_line2")
    private String addressLine2;
    private String city;
    private String state;
    @Column(name="postal_code")
    private String postalCode;
    private String country;
    @Column(name="address_type")
    private String addressType;
    @Column(name="is_default")
    private boolean isDefault;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
