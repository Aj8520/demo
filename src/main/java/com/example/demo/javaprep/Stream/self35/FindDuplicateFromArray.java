package com.example.demo.javaprep.Stream.self35;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateFromArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1 };

        int[] duplicate = Arrays.stream(arr).filter(x -> Arrays.stream(arr).filter(n -> n == x).count() > 1)
                .distinct().toArray();

        System.out.println("Duplicate elements in the array: " + Arrays.toString(duplicate));

        // Alternative approach using a HashSet

        HashSet<Integer> seen = new HashSet<>();

        List<Integer> duplicates = Arrays.stream(arr).filter(x -> !seen.add(x)).distinct().boxed().toList();
        System.out.println("Duplicate elements in the array: " + duplicates);
    }
}