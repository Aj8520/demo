package com.example.demo.javaprep.godplanisbestplan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEvenOdd {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        Map<Boolean, List<Integer>> result = test.stream().collect(Collectors.partitioningBy(c -> c % 2 == 0));

        // print list of even and odd number list

        List<List<Integer>> list = new ArrayList<>(result.values());

        System.out.println(list);

    }
}