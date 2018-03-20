package com.example.demo.api

import com.example.demo.model.CustomerJava
import com.example.demo.model.CustomerKotlin
import com.example.demo.persistence.CustomerJavaRepository
import com.example.demo.persistence.CustomerKotlinRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import java.util.ArrayList

@RestController
class ControllerKotlin {

    @Autowired
    internal var customerKotlinRepository: CustomerKotlinRepository? = null


    val customerKotlin: CustomerKotlin
        @RequestMapping(path = arrayOf("/customerKotlin/random"), method = arrayOf(RequestMethod.POST))
        get() {
            val customer = CustomerKotlin.random()
            customerKotlinRepository!!.save(customer)
            return customer
        }

    val allCustomer: List<CustomerKotlin>
        @RequestMapping(path = arrayOf("/customerKotlin"), method = arrayOf(RequestMethod.GET))
        get() {
            val all = customerKotlinRepository?.findAll()
            val result = ArrayList<CustomerKotlin>()
            all?.forEach { customer -> result.add(customer) }
            return result
        }

    @RequestMapping(path = arrayOf("/testKotlin"), method = arrayOf(RequestMethod.GET))
    fun test(): CustomerKotlin {
        return CustomerKotlin.random()
    }
}
