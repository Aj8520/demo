package com.example.demo.javaprep.codingproblem;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String input = "Ajay Jadhav";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : input.toUpperCase().toCharArray()) {
            if (c != ' ') {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(frequencyMap);
    }

}
