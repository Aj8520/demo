package com.example.demo.javaprep.Stream.self35;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementFromThreeList {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> list3 = Arrays.asList(4, 5, 7, 8, 9);

        List<Integer> commonElement = list1.stream().filter(list2::contains).filter(list3::contains).toList();

        commonElement.forEach(System.out::println);

    }
}