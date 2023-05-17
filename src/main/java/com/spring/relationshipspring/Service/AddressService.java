package com.spring.relationshipspring.Service;

import com.spring.relationshipspring.Entity.Address;
import com.spring.relationshipspring.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepo;

    public List<Address> getall(){
      return  addressRepo.findAll();
    }

}
