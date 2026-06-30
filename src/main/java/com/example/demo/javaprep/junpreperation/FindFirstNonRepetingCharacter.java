package com.example.demo.javaprep.junpreperation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetingCharacter {

    public static void main(String[] args) {
        String input = "ajayzajay";

        Map<String, Long> frequencyMap = input.chars().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String result = frequencyMap.entrySet().stream().filter(entory -> entory.getValue() == 1).map(Map.Entry::getKey)
                .findFirst().orElse(input);

        System.err.println(result);

        // simple and fast

        for (char ch : input.toCharArray()) {
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {

                System.out.println(ch);

                break;

            }
        }

        // using hashmap

        Map<Character, Long> freMap = new LinkedHashMap<>();

    }
}