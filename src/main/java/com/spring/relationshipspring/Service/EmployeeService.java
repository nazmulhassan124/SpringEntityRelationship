package com.spring.relationshipspring.Service;

import com.spring.relationshipspring.Entity.Employee;
import com.spring.relationshipspring.Entity.Project;
import com.spring.relationshipspring.Repository.EmployeeRepository;
import com.spring.relationshipspring.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    public void saveEmployee(Employee empObj) {
        employeeRepository.save(empObj);
    }

    public List<Employee> getEmployeeDetails(Long empId) {
        if (null != empId) {
         return employeeRepository.findAllByEmpId(empId);


        } else {
            return employeeRepository.findAll();
        }
    }

    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }

    public Employee assignProjectToEmployee(Long empId, Long projectId) {
        Set<Project> projectSet = null;      // null set create
        Employee employee =  employeeRepository.findById(empId).get();   //employee get
        Project project = projectRepository.findById(projectId).get();    // project get
        projectSet= employee.getAssignedProjects();    // previous employees projects get
        projectSet.add(project);    //new project insert into Set
        employee.setAssignedProjects(projectSet);    // employee object a new poject set

        return employeeRepository.save(employee);  // finally new employee update by put mapping

    }
}
