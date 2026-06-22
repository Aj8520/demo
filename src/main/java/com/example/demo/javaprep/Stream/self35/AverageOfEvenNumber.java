package com.example.demo.javaprep.Stream.self35;

import java.util.List;

public class AverageOfEvenNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        double averageOfNumber = numbers.stream().filter(n -> n % 2 == 0).mapToDouble(Integer::intValue).average()
                .orElse(0);

        System.out.println(averageOfNumber);
    }
}