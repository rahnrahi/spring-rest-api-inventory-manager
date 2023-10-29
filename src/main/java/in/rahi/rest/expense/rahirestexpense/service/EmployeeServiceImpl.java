package in.rahi.rest.expense.rahirestexpense.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rahi.rest.expense.rahirestexpense.Repository.EmployeeRepository;
import in.rahi.rest.expense.rahirestexpense.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    @Autowired
    private EmployeeRepository empRepo;

    @Override
    public List<Employee> getEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public Employee getEmployee(UUID emplId) {
        var employeeDetails = empRepo.findById(emplId);
        if(employeeDetails.isPresent()){
            return employeeDetails.get();
        }
        return null;
    }

    @Override
    public String deleteEmployee(UUID emplId) {
        empRepo.deleteById(emplId);
        return "Employee removed successfully";
    }

    @Override
    public Employee updateEmployee(UUID empId, Employee employee) {
        Employee empData = getEmployee(empId);
        if(empData!=null){
            empData.setAge(employee.getAge());
            empData.setDepartment(employee.getDepartment());
            empData.setEmail(employee.getEmail());
            empData.setLocation(employee.getLocation());
            empData.setName(employee.getName());
        }
        empRepo.save(empData);
        return empData;
    }
    
}
