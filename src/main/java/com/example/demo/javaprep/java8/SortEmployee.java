package com.example.demo.javaprep.java8;

import java.util.ArrayList;

public class SortEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));

        employees.stream().sorted().forEach(System.out::println);

    }
}