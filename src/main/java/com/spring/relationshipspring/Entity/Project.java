package com.spring.relationshipspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private Long projectId;
    private String projectName;

    @JsonIgnore
    @ManyToMany(mappedBy = "assignedProjects")
    private Set<Employee> employees = new HashSet<>();
}
