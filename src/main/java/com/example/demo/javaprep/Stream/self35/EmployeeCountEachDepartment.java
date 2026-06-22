package com.example.demo.javaprep.Stream.self35;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class EmployeeCountEachDepartment {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(0, "Alice", "IT", 70000),
                new Employee(1, "Bob", "HR", 50000),
                new Employee(2, "Charlie", "IT", 80000),
                new Employee(3, "David", "Finance", 60000),
                new Employee(4, "Eve", "HR", 55000));

        Map<String, Long> departmentEmployeeCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        departmentEmployeeCount.entrySet().forEach(System.out::println);

    }
}