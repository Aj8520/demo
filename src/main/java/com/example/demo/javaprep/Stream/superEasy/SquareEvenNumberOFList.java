package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEvenNumberOFList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 10));

        List<Integer> sqaresofEvenNumber = numbers.stream().filter(a -> a %2 ==0 ).map(a -> a * a).collect(Collectors.toList());
         System.out.println(sqaresofEvenNumber);    
        
    }
    
}
