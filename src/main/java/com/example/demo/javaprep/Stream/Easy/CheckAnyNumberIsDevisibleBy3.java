package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;

public class CheckAnyNumberIsDevisibleBy3 {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        boolean anyDivisibleBy3 = Arrays.stream(numbers).anyMatch(a -> a % 3 ==0);
        System.out.println("Is any number divisible by 3? " + anyDivisibleBy3);
    }
}