package com.example.demo.model;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
public class CustomerJava implements Serializable{

    protected CustomerJava(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String firstName;
    private String lastName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<AddressJava> addresses;

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<AddressJava> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressJava> addresses) {
        this.addresses = addresses;
    }

    public static CustomerJava random() {
        Faker fake = new Faker(Locale.GERMANY);
        Name name = fake.name();
        CustomerJava customer = new CustomerJava();
        customer.setFirstName(name.firstName());
        customer.setLastName(name.lastName());
        AddressJava address = AddressJava.random();
        List<AddressJava> addersses = new ArrayList<>();
        addersses.add(address);
        customer.setAddresses(addersses);

        return customer;

    }


}
