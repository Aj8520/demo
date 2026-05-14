package com.example.demo.javaprep.colllection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetingCharacter {

    public static void main(String[] args) {
        String input = "sstttriigga";

        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();

        for(char c: input.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println( "First non-repeating character: " + entry.getKey());
                break;
            }
        }
    }
}