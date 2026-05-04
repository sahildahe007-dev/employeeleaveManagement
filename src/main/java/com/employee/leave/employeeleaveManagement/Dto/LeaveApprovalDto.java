package com.employee.leave.employeeleaveManagement.Dto;

import lombok.Data;

@Data
public class LeaveApprovalDto {

    private int leaveId;
    private String status; // APPROVED or REJECTED
    private String managerComment;
}
