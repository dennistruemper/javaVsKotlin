package com.example.demo.model;

import com.github.javafaker.Faker;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Locale;

@Entity
public class AddressJava implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //@JsonProperty("Straße")
    private String street;
    //@JsonProperty("Hausnummer")
    private String housenumber;
    //@JsonProperty("Postleitzahl")
    private String zipcode;
    //@JsonProperty("Land")
    private String country;

    public static AddressJava random(){
        Faker fake = new Faker(Locale.GERMANY);
        com.github.javafaker.Address addressfake = fake.address();
        AddressJava address = new AddressJava();
        address.setCountry("Deutschland");
        address.setHousenumber(addressfake.streetAddressNumber());
        address.setStreet(addressfake.streetName());
        address.setZipcode(addressfake.zipCode());
        return address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
