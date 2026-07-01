package com.example.demo.javaprep.godplanisbestplan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demo.javaprep.Stream.dto.Employee;

public class Top17 {

    public static void main(String[] args) {

        String input = "AaJJAJYYzt";

        // 1 . find character frequency count

        Map<Character, Long> result = input.chars().mapToObj(c -> (char) c).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

        // 2. remove duplicate charater from string

        String unicString = input.chars()
                .distinct()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(unicString);

        // 3. find first non -repecting character

        for (char ch : input.toCharArray()) {

            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }

        }

        // 4. find second non -repecting character

        List<Character> nonrepectingCharacter = new LinkedList<>();

        for (char ch : input.toCharArray()) {

            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                nonrepectingCharacter.add(ch);
            }
        }

        System.out.println(nonrepectingCharacter.get(1));

        // 5. Find first repecting character
        for (char ch : input.toCharArray()) {

            if (input.indexOf(ch) != input.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }

        }

        // 6.Reverse words in sentence

        String sentence = "java is owsme";

        String revSentence = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.err.println(revSentence);

        String[] words = sentence.split(" ");

        String onlySentenceRevrse = Arrays.stream(words)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return String.join(" ", list);
                }));

        System.out.println(onlySentenceRevrse);

        // 7. String Rotation

        String name = "Ajay";

        String roatedString = name.chars().mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a, b) -> b + a);

        String roatatedName = new StringBuilder(name).reverse().toString();

        System.out.println(roatedString);

        System.out.println(roatatedName);

        // 8. Find duplicate element in list

        List<Integer> element = Arrays.asList(1, 2, 2, 4, 5, 4);

        HashSet<Integer> uniqeElement = new HashSet<>();

        List<Integer> duplicateList =

                element.stream().filter(e -> !uniqeElement.add(e)).collect(Collectors.toList());

        System.out.println(duplicateList);

        // 9. Remove Duplicate From list

        List<Integer> unicqList = element.stream()
                .filter(e -> uniqeElement.add(e))
                .collect(Collectors.toList());

        System.out.println(unicqList);

        // 10. Find first non repating character using stream

        Character nonRepeCharacter = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
                .orElse(null);
        System.out.println(nonRepeCharacter);

        // 11. Find Second non repating character using stream

        Character secondNonRepectingCharacter = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).skip(1).map(entry -> entry.getKey())
                .findFirst().orElse(null);

        System.out.println(secondNonRepectingCharacter);

        // 12. Count Frequency of Character usning stream

        Map<Character, Long> frequencyMap = input.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequencyMap);

        // 13. Find Higest Number in List

        Integer higestNumber = element.stream().mapToInt(n -> (Integer) n).max().orElse(0);

        System.out.println(higestNumber);

        // 14. Find Second Higest number in list

        Integer secondHigestNumber = element.stream()
                .mapToInt(n -> (Integer) n).boxed().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst()
                .orElse(0);

        System.out.println(secondHigestNumber);

        // 15. Find Employee with higest salary

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Ajay", "IT", 50000), new Employee(2, "Vijay", "HR", 60000),
                new Employee(3, "Sanjay", "Finance", 55000), new Employee(4, "Rohit", "IT", 70000),
                new Employee(5, "Rahul", "HR", 65000));

        Employee higestSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().orElse(null);
        System.out.println(higestSalary);

        // 16. Find Employee with second higest salary

        Employee secondHigestSalaryEmployee = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);

        System.out.println(secondHigestSalaryEmployee);

        // 17. Group Employee by Department
        Map<String, Employee> departmentWiseEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null))));

        System.out.println(departmentWiseEmployee);
    }
}