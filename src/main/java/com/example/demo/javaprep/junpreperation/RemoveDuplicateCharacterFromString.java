package com.example.demo.javaprep.junpreperation;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacterFromString {

    public static void main(String[] args) {
        String input = "AAJJAAYY";

        LinkedHashSet<Character> output = new LinkedHashSet<>();

        for (char ch : input.toCharArray()) {
            output.add(ch);
        }
        output.forEach(System.out::print);

        // using stream api

        String result = input.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        System.err.println(result);

        // using string builder

        StringBuilder result1 = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (result1.indexOf(String.valueOf(ch)) == -1) {
                result1.append(ch);
            }
        }

        System.err.println(result1);

    }

}