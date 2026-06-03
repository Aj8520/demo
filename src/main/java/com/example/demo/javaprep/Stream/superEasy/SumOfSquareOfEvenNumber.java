package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;

public class SumOfSquareOfEvenNumber {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2,3,4));

          Integer sumOfSquareOfEvenNumber=  numbers.stream().filter(a -> a %2 ==0).map( a -> a * a).reduce((a, b)-> a +b) .get();
         System.out.println(sumOfSquareOfEvenNumber);    
        
    }
    
}
