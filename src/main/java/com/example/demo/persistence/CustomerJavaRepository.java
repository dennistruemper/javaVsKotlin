package com.example.demo.persistence;

import com.example.demo.model.CustomerJava;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerJavaRepository extends CrudRepository<CustomerJava, Long>{
    List<CustomerJava> findByFirstNameContaining(String firstNamePart);
}
