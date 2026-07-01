package com.example.demo.javaprep.godplanisbestplan;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepectingCharacterFromString {

    public static void main(String[] args) {
        String input = "ajayzajay";

        // collect in optional character
        Optional<Character> result = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst();

        System.err.println(result.orElse(null));

    }
}