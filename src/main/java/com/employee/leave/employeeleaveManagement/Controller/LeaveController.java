package com.employee.leave.employeeleaveManagement.Controller;

import com.employee.leave.employeeleaveManagement.Dto.LeaveRequestDto;
import com.employee.leave.employeeleaveManagement.Entity.LeaveRequest;
import com.employee.leave.employeeleaveManagement.Service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveController {

    @Autowired
    private LeaveService service;

    @PostMapping("/apply")
    public LeaveRequest applyLeave(@RequestBody LeaveRequestDto dto) {
        return service.applyLeave(dto);
    }

    @GetMapping("/all")
    public List<LeaveRequest> getAllLeaves() {
        return service.getAllLeaves();
    }
}