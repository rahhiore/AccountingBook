package com.book.accountingbook;

import com.book.accountingbook.exceptions.EmployeeAlreadyAddedException;
import com.book.accountingbook.exceptions.EmployeeNotFoundException;
import com.book.accountingbook.exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
@Service
public class EmployeeServiceImp implements EmployeeService {
    List<Employee> employees = new LinkedList<>();
    private static final int quantity = 50;

    @Override
    public String homePage() {
        return null;
    }

    @Override
    public Employee findEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        } else {
            return employee;
        }

    }
    @Override
    public void addEmployee(Employee employee) {
        if (employees.indexOf(employee) >= quantity) {
            throw new EmployeeStorageIsFullException();
        } else if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employees.add(employee);
        }
    }
    public void removeEmployee(Employee employee) {

        if (!employees.contains(employee)) {
            throw new EmployeeNotFoundException();
        } else {
            employees.remove(employee);
        }
    }
    public List<Employee> showAllEmployees() {
        return employees;
    }
}
