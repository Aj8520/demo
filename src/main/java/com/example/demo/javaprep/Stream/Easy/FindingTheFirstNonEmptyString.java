package com.example.demo.javaprep.Stream.Easy;

public class FindingTheFirstNonEmptyString {

    public static void main(String[] args) {
        String[] strings = { "", "Hello", "World", "" };

        String firstNonEmptyString = java.util.Arrays.stream(strings)
                .filter(s -> !s.isEmpty())
                .findFirst()
                .orElse("No non-empty string found");

        System.out.println("First non-empty string: " + firstNonEmptyString);
    }
}