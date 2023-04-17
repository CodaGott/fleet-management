package com.fleetmanager.fleetmanagement.services;

import com.fleetmanager.fleetmanagement.models.Employee;
import com.fleetmanager.fleetmanagement.models.dto.EmployeeDto;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);
    Employee getEmployee(String employeeEmail);
    Employee updateEmployeeInfo(Long employeeId, EmployeeDto employeeDto);
    void deleteEmployee(Long employeeId);
}
