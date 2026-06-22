package com.example.demo.javaprep.Stream.self35;

import java.util.Comparator;
import java.util.List;

import com.example.demo.javaprep.Stream.dto.Employee;

public class SortEmployeeList {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(0, "Alice", "IT", 70000),
                new Employee(1, "Bob", "HR", 50000),
                new Employee(2, "Charlie", "IT", 80000),
                new Employee(3, "David", "Finance", 60000),
                new Employee(4, "Eve", "HR", 55000));

        List<Employee> sortedByDepartment = employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment).reversed()).toList();

        System.out.println("Employees sorted by department:");
        sortedByDepartment.forEach(System.out::println);
    }
}