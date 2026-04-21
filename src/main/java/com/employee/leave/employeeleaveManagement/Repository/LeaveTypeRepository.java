package com.employee.leave.employeeleaveManagement.Repository;

import com.employee.leave.employeeleaveManagement.Entity.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType,Integer> {
}
