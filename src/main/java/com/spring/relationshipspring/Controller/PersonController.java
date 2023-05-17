package com.spring.relationshipspring.Controller;

import com.spring.relationshipspring.Entity.Person;
import com.spring.relationshipspring.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personSer;

    @PostMapping("/save")
    public Person create (@RequestBody Person person){
        return  personSer.create(person);

    }

    @GetMapping("/getAll")
    public List<Person> getall(){
        return  personSer.getall();
    }


}
