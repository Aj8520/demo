package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;
import java.util.List;

public class AverageOfElement {

    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50);

        double avecrage = Arrays.stream(numbers).average().orElse(0);

        avecrage = numberList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + avecrage);
    }

}