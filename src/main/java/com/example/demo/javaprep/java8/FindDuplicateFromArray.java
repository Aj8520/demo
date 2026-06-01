package com.example.demo.javaprep.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

class FindDuplicateFromArray {

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 2, 3 };
        HashSet<Integer> unic = new HashSet<>();
        ArrayList<Integer> duplicates = Arrays.stream(arr).filter(i -> !unic.add(i))
                .collect(Collectors.toCollection(ArrayList::new));
        System.err.println(duplicates);
    }
}
