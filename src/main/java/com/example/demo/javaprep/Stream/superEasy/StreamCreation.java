package com.example.demo.javaprep.Stream.superEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 10));
        // using .stream()
        numbers.stream().forEach(System.out :: println);
        // using Arrays.Stream()
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 10};
        Arrays.stream(arr).forEach(System.out :: println);
        // using Stream.of()
       Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
       // ussing Stream.builder()
        Stream<Integer> stream1 = Stream.<Integer>builder().add(1).add(2).add(3).add(4).add(5).build();
        stream1.forEach(System.out :: println);
        // using Stream.generate()
        Stream<Integer> stream2 = Stream.generate(() -> (int)(Math.random() * 100)).limit(10);
        stream2.forEach(System.out :: println);
        
    }
    
}
