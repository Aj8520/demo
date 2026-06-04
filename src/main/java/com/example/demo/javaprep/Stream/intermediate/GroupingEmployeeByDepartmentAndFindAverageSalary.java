package com.example.demo.javaprep.Stream.intermediate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class GroupingEmployeeByDepartmentAndFindAverageSalary {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(0, "Ajay", "it", 50000),
                new Employee(0, "vijay", "hr", 60000),
                new Employee(0, "ramesh", "admin", 70000),
                new Employee(0, "rahul", "it", 50000),
                new Employee(0, "dan", "it", 80000)

        );

        Map<String, Double> averageSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary by department: " + averageSalaryByDepartment);

    }
}