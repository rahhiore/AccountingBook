package com.book.accountingbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String homePage() {
        return "hello world!";
    }
    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return employeeService.findEmployee(employee);
    }
    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                              @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeService.addEmployee(employee);
        return employee;
    }
    @GetMapping(path = "/remove")
    public Employee removeEmployee(@RequestParam("firstName") String firstName,
                                 @RequestParam("lastName") String lastName) {
        Employee employee = new Employee(firstName, lastName);
        employeeService.removeEmployee(employee);
        return employee;
    }
    @GetMapping(path = "/showAll")
    public List<Employee> showAllEmployees() {
         return employeeService.showAllEmployees();
    }

}
