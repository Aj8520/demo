package com.example.demo.javaprep.Stream.Easy;

import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

    public static void main(String[] args) {

        List<String> list = List.of("apple", "banana", "apple", "orange", "banana", "grape");

        // Using a Set to remove duplicates
        Set<String> distinctSet = Set.copyOf(list);
        List<String> distinctList = List.copyOf(distinctSet);

        System.out.println("Original List: " + list);
        System.out.println("Distinct List: " + distinctList);

        // set giving error as set is not ordered and list is ordered so we can not
        // convert set to list directly

        distinctList = list.stream().distinct().toList();
        System.out.println("Distinct List (using stream): " + distinctList);
    }

}
