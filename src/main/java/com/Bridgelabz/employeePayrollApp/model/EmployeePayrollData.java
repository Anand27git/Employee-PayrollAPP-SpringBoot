package com.Bridgelabz.employeePayrollApp.model;

import com.Bridgelabz.employeePayrollApp.dto.EmployeePayrollDTO;
import lombok.Data;
@Data
public class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData() {}

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }
}