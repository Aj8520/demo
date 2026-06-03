package com.example.demo.javaprep.Stream.Easy;

import java.util.List;

public class FlattiningLIstOfLIst {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flattened List: " + flattenedList);
    }
}