package com.example.demo.api;

import com.example.demo.model.CustomerJava;
import com.example.demo.persistence.CustomerJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerJava {

    @Autowired
    CustomerJavaRepository customerJavaRepository;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public CustomerJava test(){
        CustomerJava customer = CustomerJava.random();
        return customer;
    }


    @RequestMapping(path = "/customerJava/random",method = RequestMethod.POST)
    public CustomerJava getCustomerJava(){
        CustomerJava customer = CustomerJava.random();
        customerJavaRepository.save(customer);
        return customer;
    }

    @RequestMapping(path = "/customerJava", method = RequestMethod.GET)
    public List<CustomerJava> getAllCustomer(){
        Iterable<CustomerJava> all = customerJavaRepository.findAll();
        List<CustomerJava> result = new ArrayList<>();
        if(all != null){
            all.forEach(customer -> result.add(customer));
        }
        return result;
    }
}
