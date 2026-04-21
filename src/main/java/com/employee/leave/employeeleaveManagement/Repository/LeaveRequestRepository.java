package com.employee.leave.employeeleaveManagement.Repository;

import com.employee.leave.employeeleaveManagement.Entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Integer> {
}
