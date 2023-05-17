package com.spring.relationshipspring.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="person_id")
    private Long personId;

    private String name;
    private Integer age;

  //  @OneToOne(cascade = CascadeType.ALL)
    // note : @JoinColumn ai line na dile default vabe address_add_id create kore nibe
   // @JoinColumn(name="fk_add_id")


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_add_id", referencedColumnName = "person_id")

    private List<Address> address;




}
