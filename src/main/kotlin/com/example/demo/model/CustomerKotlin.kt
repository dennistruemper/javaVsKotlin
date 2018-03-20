package com.example.demo.model

import com.github.javafaker.Faker
import com.github.javafaker.Name

import javax.persistence.*
import java.io.Serializable
import java.util.ArrayList
import java.util.Locale

@Entity
data class CustomerKotlin(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long = 0,

    var firstName: String = "",
    var lastName: String = "",

    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    var addresses: List<AddressKotlin> = ArrayList()
){
    constructor(firstName: String, lastName: String, addresses: List<AddressKotlin>):
        this(0, firstName, lastName, addresses)

    companion object {
        fun random(): CustomerKotlin {
            val fake = Faker(Locale.GERMANY)
            val name = fake.name()
            val addresses = listOf(AddressKotlin.random())

            val customer = CustomerKotlin(
                    firstName = name.firstName(),
                    lastName = name.lastName(),
                    addresses = addresses
            )
            return customer
        }
    }
}
