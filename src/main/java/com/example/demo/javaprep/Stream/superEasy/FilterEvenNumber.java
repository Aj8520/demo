package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {

    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 10));

        List<Integer> evenNumbers =  numbers.stream().filter(n -> n  % 2 ==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
    
}
