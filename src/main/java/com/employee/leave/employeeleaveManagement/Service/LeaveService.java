package com.employee.leave.employeeleaveManagement.Service;

import com.employee.leave.employeeleaveManagement.Dto.LeaveRequestDto;
import com.employee.leave.employeeleaveManagement.Entity.Employee;
import com.employee.leave.employeeleaveManagement.Entity.LeaveRequest;
import com.employee.leave.employeeleaveManagement.Entity.LeaveType;
import com.employee.leave.employeeleaveManagement.Repository.EmployeeRepository;
import com.employee.leave.employeeleaveManagement.Repository.LeaveRequestRepository;
import com.employee.leave.employeeleaveManagement.Repository.LeaveTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;

    @Autowired
    private LeaveRequestRepository leaverepo;

    public LeaveRequest applyLeave(LeaveRequestDto dto) {

        Employee employee = employeeRepository.findById(dto.getEmployeeId()).orElseThrow(()-> new RuntimeException("Employee is not found"));

        LeaveType leaveType = leaveTypeRepository.findById(dto.getLeaveTypeId()).orElseThrow(()-> new RuntimeException("Leave type is not match"));

        LeaveRequest request = new LeaveRequest();
        request.setStartDate(dto.getStartDate());
        request.setEndDate(dto.getEndDate());
        request.setLeaveType(leaveType);
        request.setStatus("PENDING");

        request.setEmployee(employee);//Employee la request madhe set kela
        request.setLeaveType(leaveType);//same for leave type

        return leaverepo.save(request);//leave repository madhe return
    }

    public List<LeaveRequest> getAllLeaves() {
        return leaverepo.findAll();
    }
}




