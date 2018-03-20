package com.example.demo.model

import com.github.javafaker.Faker

import java.util.Locale
import javax.persistence.*

@Entity
data class AddressKotlin(

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private val id: Long = 0,

        //@JsonProperty("Straße")
        var street: String = "",
        //@JsonProperty("Hausnummer")
        var housenumber: String? = null,
        //@JsonProperty("Postleitzahl")
        var zipcode: String? = null,
        //@JsonProperty("Land")
        var country: String = "") {

    constructor(street: String, housenumber: String?, zipcode: String?, country: String) :
            this(0, street, housenumber, zipcode, country)


    companion object {

        fun random(): AddressKotlin {
            val fake = Faker(Locale.GERMANY)
            val addressfake = fake.address()
            val address = AddressKotlin(
                    country = "Deutschland",
                    housenumber = addressfake.streetAddressNumber(),
                    street = addressfake.streetName(),
                    zipcode = addressfake.zipCode())
            return address
        }
    }
}

