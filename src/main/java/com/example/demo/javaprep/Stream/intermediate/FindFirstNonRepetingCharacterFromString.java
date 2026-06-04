package com.example.demo.javaprep.Stream.intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetingCharacterFromString {

    public static void main(String[] args) {
        String input = "hello world";
        Map.Entry<Character, Long> firstNonRepeating = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new, // Guarantees character position preservation
                        Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .orElseThrow();
        System.out.println("First non-repeating character: " + firstNonRepeating.getKey());
    }
}