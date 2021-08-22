package com.Bridgelabz.employeePayrollApp.service;

import com.Bridgelabz.employeePayrollApp.dto.EmployeePayrollDTO;
import com.Bridgelabz.employeePayrollApp.model.EmployeePayrollData;
import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}

