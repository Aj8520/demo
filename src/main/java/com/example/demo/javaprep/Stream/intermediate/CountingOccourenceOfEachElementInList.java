package com.example.demo.javaprep.Stream.intermediate;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingOccourenceOfEachElementInList {

    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "fig", "grape", "apple", "banana");
        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Word count: " + wordCount);
    }
}