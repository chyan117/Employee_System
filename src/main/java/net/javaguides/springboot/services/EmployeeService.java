package net.javaguides.springboot.services;

import net.javaguides.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleEmployeeById(Long id);
}
