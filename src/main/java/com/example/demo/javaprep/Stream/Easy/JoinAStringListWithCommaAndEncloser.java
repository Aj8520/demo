package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAStringListWithCommaAndEncloser {

    public static void main(String[] args) {
        
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "orange");

        String result = words.stream()
                .collect(Collectors.joining(", ", "[ ", " ]")); // Join with a comma and space, enclose in double quotes

        System.out.println(result);
    }
}