package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/core-java-collection-framework")
public class JavaCollectionFrameworkController {

    @GetMapping("collection-example")
    public String helloJavaCollection() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(5);

        Collections.sort(list);

        System.out.println("ArrayList contents: " + list);

        return "Java Collection Framework example endpoint. Check the console for details.";

    }

}
