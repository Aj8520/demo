package com.example.demo.javaprep.Stream.intermediate;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingLIstOfWordByThereLength {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);
    }
}