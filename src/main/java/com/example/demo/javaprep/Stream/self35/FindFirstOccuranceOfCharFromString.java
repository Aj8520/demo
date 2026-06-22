package com.example.demo.javaprep.Stream.self35;

import java.util.stream.IntStream;

public class FindFirstOccuranceOfCharFromString {

    public static void main(String[] args) {

        String str = "hello world";
        char target = 'o';

        int index = IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == target)
                .findFirst()
                .orElse(-1);

        System.out.println("Index of first occurrence of '" + target + "': " + index);
    }
}