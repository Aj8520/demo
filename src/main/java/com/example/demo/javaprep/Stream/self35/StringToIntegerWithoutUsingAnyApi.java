package com.example.demo.javaprep.Stream.self35;

public class StringToIntegerWithoutUsingAnyApi {

    public static void main(String[] args) {
        String str = "1233425";
        int result = 0;
        for (char ch : str.toCharArray()) {
            result = result * 10 + (ch - '0');
        }
        System.out.println("Converted integer: " + result);

        int number = str.chars().map(ch -> ch - '0').reduce(0, (result1, digit) -> result1 * 10 + digit);
        System.out.println("Converted integer: " + number);

    }
}