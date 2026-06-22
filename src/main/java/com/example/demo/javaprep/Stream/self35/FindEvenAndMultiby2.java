package com.example.demo.javaprep.Stream.self35;

import java.util.Arrays;
import java.util.List;

public class FindEvenAndMultiby2 {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> multiby2List = number.stream().filter(n -> n % 2 == 0).map(n -> n * 2).toList();

        multiby2List.forEach(System.out::println);
    }
}