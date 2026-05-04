package com.employee.leave.employeeleaveManagement.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;
    private String status;
    private String managerComment;


    @ManyToOne
    @JoinColumn(name ="employee_id")
    @JsonBackReference
    private Employee employee;

    @ManyToOne
    @JoinColumn(name ="leave_type_id")
    private LeaveType leaveType;
}
