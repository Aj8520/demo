package com.example.demo.javaprep.Stream.intermediate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class FindDepartmentThatHigestAverageSalary {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(0, "Ajay", "it", 50000),
                new Employee(0, "vijay", "hr", 60000),
                new Employee(0, "ramesh", "admin", 70000),
                new Employee(0, "rahul", "it", 50000),
                new Employee(0, "dan", "it", 80000)

        );

        String departmentWithHighestAverageSalary = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("No department found");

        System.out.println("Department with highest average salary: " + departmentWithHighestAverageSalary);

    }
}