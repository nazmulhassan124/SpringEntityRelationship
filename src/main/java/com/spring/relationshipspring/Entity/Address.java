package com.spring.relationshipspring.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@Entity
@Table(name="address")
@Data
@Transactional
@NoArgsConstructor
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="add_id")
    private Long addressId;


    private String city;
    private String addressType;
    private String zilla;
}
