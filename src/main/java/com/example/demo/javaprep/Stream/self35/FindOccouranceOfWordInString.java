package com.example.demo.javaprep.Stream.self35;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccouranceOfWordInString {

    public static void main(String[] args) {
        String str = "java spring java microservices spring java";

        Map<String, Long> frequencyMap = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        frequencyMap.forEach((k, v) -> System.out.println("  " + k + "  occurance : " + v));

    }
}