package com.employee.leave.employeeleaveManagement.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LeaveRequestDto {
    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;

    private int employeeId;
    private int leaveTypeId;
}
