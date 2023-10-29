package in.rahi.rest.expense.rahirestexpense.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rahi.rest.expense.rahirestexpense.entity.Employee;
import in.rahi.rest.expense.rahirestexpense.service.EmployeeServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeservice;
    
    @GetMapping()
    public List<Employee> getEmployees(){
        return employeeservice.getEmployees();
    }

    @GetMapping("{empId}")
    public Employee getEmployee(@PathVariable UUID empId){
        return employeeservice.getEmployee(empId);
    }

    @DeleteMapping("{empId}")
    public String deleteEmployee(@PathVariable UUID empId){
        return employeeservice.deleteEmployee(empId);
    }

    @PostMapping()
    public Employee saveEmployee(@Valid @RequestBody Employee employeeModel){
        return employeeservice.saveEmployee(employeeModel);
    }
    @PutMapping("{empId}")
    public Employee updateEmployee(@PathVariable UUID empId, @RequestBody Employee employeeModel){
        return employeeservice.updateEmployee(empId, employeeModel);
    }
}
