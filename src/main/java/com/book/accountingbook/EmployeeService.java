package com.book.accountingbook;

import java.util.List;

public interface EmployeeService {
    String homePage();
    Employee findEmployee(Employee employee);
    void addEmployee(Employee employee);
    void removeEmployee(Employee employee);
    List<Employee> showAllEmployees();
}
