package com.example.demo.api

import com.example.demo.model.CustomerJava
import com.example.demo.persistence.CustomerJavaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

import java.util.ArrayList

@RestController
class ControllerKotlinMixed {

    @Autowired
    internal var customerJavaRepository: CustomerJavaRepository? = null


    val customerJava: CustomerJava
        @RequestMapping(path = arrayOf("/customerMixed/random"), method = arrayOf(RequestMethod.POST))
        get() {
            val customer = CustomerJava.random()
            customerJavaRepository!!.save(customer)
            return customer
        }

    val allCustomer: List<CustomerJava>
        @RequestMapping(path = arrayOf("/customerMixed"), method = arrayOf(RequestMethod.GET))
        get() {
            val all = customerJavaRepository?.findAll()
            val result = ArrayList<CustomerJava>()
            all?.forEach { customer -> result.add(customer) }
            return result
        }

    @RequestMapping(path = arrayOf("/testMixed"), method = arrayOf(RequestMethod.GET))
    fun test(): CustomerJava {
        return CustomerJava.random()
    }
}
