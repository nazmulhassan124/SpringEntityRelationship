package com.spring.relationshipspring.Repository;

import com.spring.relationshipspring.Entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository< Address,Long > {
}
