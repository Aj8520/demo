package com.example.demo.javaprep.Stream.self35;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class FrequencyOfName {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(0, "Ajay", "IT", 70000),
                new Employee(1, "Bob", "HR", 50000),
                new Employee(5, "Ajay", "Finance", 0),
                new Employee(2, "Charlie", "IT", 80000),
                new Employee(3, "David", "Finance", 60000),
                new Employee(4, "Eve", "HR", 55000));

        Map<String, Long> frequencyMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getName, Collectors.counting()));

        frequencyMap.forEach((k, v) -> System.out.println("name " + k + " frequency -> " + v));
    }
}