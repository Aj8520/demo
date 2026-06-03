package com.example.demo.javaprep.Stream.Easy;

import java.util.List;

public class CheckAllElementIsPositiveNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, -40, 50);

        boolean allPositive = numbers.stream().allMatch(a -> a > 0);

        System.out.println("All elements are positive numbers: " + allPositive);
    }
}