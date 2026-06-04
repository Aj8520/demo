package com.example.demo.javaprep.Stream.intermediate;

import java.util.List;

import com.example.demo.javaprep.Stream.dto.Person;

public class CalculateAverageAgeFromListOfPerson {

    public static void main(String[] args) {

        List<Person> people = List.of(
                createPerson(1, "Ajay", 25),
                createPerson(2, "vijay", 30),
                createPerson(3, "ramesh", 35),
                createPerson(4, "rahul", 40),
                createPerson(5, "dan", 45)

        );

        double averageAge = people.stream().mapToInt(Person::getAge).average().orElse(0.0);
        System.out.println("Average age: " + averageAge);

    }

    private static Person createPerson(int i, String string, int j) {
        Person person = new Person();
        person.setId(i);
        person.setName(string);
        person.setAge(j);
        return person;
    }
}