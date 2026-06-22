package com.example.demo.javaprep.Stream.self35;

import java.util.stream.Collectors;

public class PrintOnyNumberFromCharArray {

    public static void main(String[] args) {
        char[] arr = "a1b23b4".toCharArray();

        // new String(arr).chars()
        // .filter(Character::isDigit)
        // .forEach(ch -> System.out.println((char) ch));

        String number = new String(arr).chars().filter(Character::isDigit)
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
        System.out.println(number);
    }
}