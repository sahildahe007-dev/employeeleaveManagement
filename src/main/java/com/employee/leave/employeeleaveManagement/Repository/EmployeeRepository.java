package com.employee.leave.employeeleaveManagement.Repository;

import com.employee.leave.employeeleaveManagement.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
