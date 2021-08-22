package com.Bridgelabz.employeePayrollApp.service;

import com.Bridgelabz.employeePayrollApp.dto.EmployeePayrollDTO;
import com.Bridgelabz.employeePayrollApp.model.EmployeePayrollData;
import java.util.List;
/*
* Employee Payroll Service Interface */

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}
