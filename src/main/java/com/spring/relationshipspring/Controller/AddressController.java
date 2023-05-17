package com.spring.relationshipspring.Controller;

import com.spring.relationshipspring.Entity.Address;
import com.spring.relationshipspring.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addService;

    @GetMapping("/getAll")
    public List<Address> getall (){
        return  addService.getall();
    }
}
