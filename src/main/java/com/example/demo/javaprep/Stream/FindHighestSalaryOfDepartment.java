package com.example.demo.javaprep.Stream;

import com.example.demo.javaprep.Stream.dto.Employee;

import java.util.Arrays;
import java.util.List;

public class FindHighestSalaryOfDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Ajay", "IT", 50000)
                , new Employee(2, "Vijay", "HR", 60000), new Employee(3, "Sanjay", "Finance", 55000), new Employee(4, "Rohit", "IT", 70000), new Employee(5, "Rahul", "HR", 65000)
        );
    }
}
