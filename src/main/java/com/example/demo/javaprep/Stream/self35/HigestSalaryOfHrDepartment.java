package com.example.demo.javaprep.Stream.self35;

import java.util.Comparator;
import java.util.List;

import com.example.demo.javaprep.Stream.dto.Employee;

public class HigestSalaryOfHrDepartment {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(0, "Alice", "IT", 70000),
                new Employee(1, "Bob", "HR", 50000),
                new Employee(2, "Charlie", "IT", 80000),
                new Employee(3, "David", "Finance", 60000),
                new Employee(4, "Eve", "HR", 55000));

        Double higestSalary = employees.stream().filter(a -> a.getDepartment() == "IT").mapToDouble(Employee::getSalary)
                .max().getAsDouble();

        System.out.println(higestSalary);

        // higest slary employee

        Employee higestSalaryEmployee = employees.stream().filter(e -> "IT".equals(e.getDepartment()))
                .max(Comparator.comparing(Employee::getSalary)).orElse(null);

        System.out.println(higestSalaryEmployee);
    }
}