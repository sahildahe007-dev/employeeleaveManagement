package com.employee.leave.employeeleaveManagement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class LeaveType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typeName;
    @OneToMany(mappedBy = "leaveType")
    @JsonIgnore
    private List<LeaveRequest> leaveRequests;
}
