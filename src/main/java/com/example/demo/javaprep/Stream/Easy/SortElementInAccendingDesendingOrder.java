package com.example.demo.javaprep.Stream.Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortElementInAccendingDesendingOrder {

    public static void main(String[] args) {
        
            List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50);

            List<Integer> sortedList = numberList.stream().sorted(Comparator.reverseOrder()).toList();
            System.out.println("Sorted List (Descending): " + sortedList);
    }
}