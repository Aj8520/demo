package com.example.demo.javaprep.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class SortAccendingDesending {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ajay", "IT", 50000);
        Employee emp2 = new Employee(2, "Vijay", "HR", 60000);
        Employee emp3 = new Employee(3, "Sanjay", "Finance", 55000);
        Employee emp4 = new Employee(4, "Rohit", "IT", 70000);
        Employee emp5 = new Employee(5, "Rahul", "HR", 65000);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("Employees sorted by salary in ascending order:" + sortedEmployees);

    }

}
