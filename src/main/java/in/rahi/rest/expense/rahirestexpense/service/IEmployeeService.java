package in.rahi.rest.expense.rahirestexpense.service;

import java.util.List;
import java.util.UUID;

import in.rahi.rest.expense.rahirestexpense.entity.Employee;

public interface IEmployeeService {
    List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployee(UUID emplId);
    Employee updateEmployee(UUID empId, Employee employee);

    String deleteEmployee(UUID emplId);
}
