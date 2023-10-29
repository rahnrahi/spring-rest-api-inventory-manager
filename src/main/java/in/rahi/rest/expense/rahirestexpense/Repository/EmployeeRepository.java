package in.rahi.rest.expense.rahirestexpense.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.rahi.rest.expense.rahirestexpense.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID>{
    
}
