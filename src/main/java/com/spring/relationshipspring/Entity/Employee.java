package com.spring.relationshipspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Long empId;
    private String empName;


    @ManyToMany
    @JoinTable(name = "employee_project",
           joinColumns = @JoinColumn(name="employee_id"),
            inverseJoinColumns = @JoinColumn(name="project_id"))
   private Set<Project> assignedProjects = new HashSet<>();

}
