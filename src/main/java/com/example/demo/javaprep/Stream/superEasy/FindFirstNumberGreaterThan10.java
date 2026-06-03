package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstNumberGreaterThan10 {

        public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 22, 13, 42, 5, 6, 7, 7, 8, 10));

      Optional<Integer>  firstNumberGreaterThan10= numbers.stream().filter(a -> a > 10).sorted().findFirst();
         System.out.println(firstNumberGreaterThan10.orElse(null));    
        
    }
    
}
