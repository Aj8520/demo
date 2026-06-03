package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;

public class CountingElementGreaterThan5 {

       public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 22, 13, 42, 5, 6, 7, 7, 8, 10));

          Long firstNumberGreaterThan10= numbers.stream().filter(a -> a >= 5).count();
         System.out.println(firstNumberGreaterThan10);    
        
    }
    
}
