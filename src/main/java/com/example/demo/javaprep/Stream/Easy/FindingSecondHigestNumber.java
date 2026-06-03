package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindingSecondHigestNumber {

    public static void main(String[] args) {
       List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int secondHighest =numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println("Second highest number: " + secondHighest);
    }
}