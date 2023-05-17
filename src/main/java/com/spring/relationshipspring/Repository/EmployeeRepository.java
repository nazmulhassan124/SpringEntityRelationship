package com.spring.relationshipspring.Repository;

import com.spring.relationshipspring.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository  extends JpaRepository<Employee,Long> {

    List<Employee> findAllByEmpId(Long empId);


}
