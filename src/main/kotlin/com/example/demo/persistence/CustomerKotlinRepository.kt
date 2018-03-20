package com.example.demo.persistence

import com.example.demo.model.CustomerJava
import com.example.demo.model.CustomerKotlin
import org.springframework.data.repository.CrudRepository

interface CustomerKotlinRepository : CrudRepository<CustomerKotlin, Long> {
    fun findByFirstNameContaining(firstNamePart: String): List<CustomerKotlin>
}
