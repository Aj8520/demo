package com.example.demo.javaprep.Stream.jun9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class JavaStreamCodingProblem {

    public static void main(String[] args) {

        // 1. Print a list using Lambda Expressions.
        List<String> names = List.of("Ajay", "Vijay", "Ramesh", "Rahul", "Dan", "Ajay", "Vijay");

        names.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // 2. Filter even numbers from a list using Streams.
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // 3. Find the maximum value in a list using Streams.
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);

        List<String> uppercaseNames = names.stream().map(String::toUpperCase)
                .collect(Collectors.toList());

        // 4. Convert a list of strings to uppercase.
        uppercaseNames.forEach(System.out::println);

        Map<Integer, List<String>> namesByLength = names.stream().collect(Collectors.groupingBy(String::length));
        // 5. Group a list of strings by their length.
        namesByLength.forEach((length, nameList) -> {
            System.out.println("Length: " + length);
            nameList.forEach(System.out::println);
        });
        // 6. Find the sum of numbers using reduce().
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        Map<String, Long> nameCounts = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // 7. Count the occurrences of each string in a list.
        nameCounts.forEach((name, count) -> System.out.println("Name: " + name + ", Count: " + count));

        List<String> words = Arrays.asList("Java", "is", "awesome");

        // 8. Join a list of strings into a single string with a delimiter.
        String joined = words.stream().collect(Collectors.joining());
        System.out.println("Joined: " + joined);

        List<Employee> employees = List.of(
                new Employee(0, "Alice", "IT", 70000),
                new Employee(1, "Bob", "HR", 50000),
                new Employee(2, "Charlie", "IT", 80000),
                new Employee(3, "David", "Finance", 60000),
                new Employee(4, "Eve", "HR", 55000));

        // 9. Sort a list of objects based on a specific field.
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

    }
}