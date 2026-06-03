package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;
import java.util.List;

public class CountOfElementStartingWithA {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape", "apricot", "orange");

        long count = words.stream().filter(word -> word.startsWith("a") || word.startsWith("A")).count();

        System.out.println("Count of elements starting with 'A': " + count);
    }
}