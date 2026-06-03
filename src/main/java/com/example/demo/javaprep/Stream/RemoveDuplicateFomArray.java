package com.example.demo.javaprep.Stream;

import java.util.Arrays;

public class RemoveDuplicateFomArray {

public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};

   int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
    System.out.println(java.util.Arrays.toString(uniqueArr));
}
    
}
