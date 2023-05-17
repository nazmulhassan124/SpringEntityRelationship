package com.spring.relationshipspring.Service;

import com.spring.relationshipspring.Entity.Person;
import com.spring.relationshipspring.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

@Autowired
PersonRepository personRepo;

    public Person create (Person per){
        if(!per.equals(null)){
     return  personRepo.save(per);
        }
            return  null;
      }

      public List<Person> getall (){
       return personRepo.findAll();
      }


}
