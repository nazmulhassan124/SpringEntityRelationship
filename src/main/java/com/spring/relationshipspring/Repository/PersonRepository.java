package com.spring.relationshipspring.Repository;

import com.spring.relationshipspring.Entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<Person,Long> {
}
