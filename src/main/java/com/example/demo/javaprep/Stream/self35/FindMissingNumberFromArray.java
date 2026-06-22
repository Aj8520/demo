package com.example.demo.javaprep.Stream.self35;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumberFromArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6 };

        int n = arr.length + 1;

        int expectedsum = n * (n + 1) / 2;

        int actualsum = Arrays.stream(arr).sum();

        int a = expectedsum - actualsum;

        System.out.println(a);

        // usign java 8 stream

        int missingNumber = IntStream.rangeClosed(1, n).sum()
                - Arrays.stream(arr).sum();

        System.out.println("using stream api : " + missingNumber);

        // using xor
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= arr.length + 1; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        System.out.println(xor1 ^ xor2);

        // multiple =

        Set<Integer> set = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        IntStream.rangeClosed(1, 7)
                .filter(i -> !set.contains(i))
                .forEach(System.out::println);

    }

}