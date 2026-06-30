package com.example.demo.javaprep.junpreperation;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequency {

    public static void main(String[] args) {
        String input = "Ajay Jadhav";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char a : input.trim().replace(" ", "").toLowerCase().toCharArray()) {

            frequencyMap.put(a, frequencyMap.getOrDefault(a, 0) + 1);
        }

        System.err.println(frequencyMap.toString());

        // using stream

        Map<Character, Long> frequencyMap2 =

                input.trim().replace(" ", "").toLowerCase().chars().mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap2);

    }

}