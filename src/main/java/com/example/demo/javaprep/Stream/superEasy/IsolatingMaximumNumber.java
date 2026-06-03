package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class IsolatingMaximumNumber {

        public static void main(String[] args) {
    
            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(List.of(1, 22, 13, 42, 5, 6, 7, 7, 8, 10));
    
            Optional<Integer> maxNumber= numbers.stream().reduce(Integer::max);
            System.out.println(maxNumber.get());    
            
        }
    
}
