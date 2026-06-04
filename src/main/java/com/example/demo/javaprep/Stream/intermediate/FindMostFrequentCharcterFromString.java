package com.example.demo.javaprep.Stream.intermediate;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostFrequentCharcterFromString {

    public static void main(String[] args) {
        String input = "hello world";
        char mostFrequentChar = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}