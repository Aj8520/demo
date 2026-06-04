package com.example.demo.javaprep.Stream.intermediate;

import java.util.Comparator;
import java.util.List;

import com.example.demo.javaprep.Stream.dto.Employee;

public class SortingListOfEmployeeBySalary {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(0, "Ajay", "it", 50000),
                new Employee(0, "vijay", "hr", 60000),
                new Employee(0, "ramesh", "admin", 70000),
                new Employee(0, "rahul", "it", 50000),
                new Employee(0, "dan", "it", 80000)

        );

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("sorted employees" + sortedEmployees);
    }
}