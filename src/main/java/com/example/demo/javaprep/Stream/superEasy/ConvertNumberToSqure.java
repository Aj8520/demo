package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;

public class ConvertNumberToSqure {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 10));

        List<Integer> sqares = numbers.stream().map(a -> a * a).toList();
        System.out.println(sqares);
    }

}
