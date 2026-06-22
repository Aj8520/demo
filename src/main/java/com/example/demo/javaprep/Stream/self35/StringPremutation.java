package com.example.demo.javaprep.Stream.self35;

public class StringPremutation {
    public static void main(String[] args) {
        permutation("", "Ajay");
    }

    public static void permutation(String prefix, String str) {

        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            permutation(
                    prefix + str.charAt(i),
                    str.substring(0, i) + str.substring(i + 1));
        }
    }

}