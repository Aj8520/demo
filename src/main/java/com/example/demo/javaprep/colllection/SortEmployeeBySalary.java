package com.example.demo.javaprep.colllection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortEmployeeBySalary {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(1, "Alice", 500000);
        Employee e2 = new Employee(2, "Bob", 60000);
        Employee e3 = new Employee(3, "Charlie", 70000);
        list.add(e2);

        list.add(e1);

        list.add(e3);

        // Sort employees by salary
        Comparator<Employee> salaryComparator = Comparator.comparingDouble(e -> e.salary);

        // Sort in descending order using lambda;
        // list.sort((a, b) -> Double.compare(b.salary, a.salary));

        // list.sort(salaryComparator);

        /// this work because comparable is implemented in employee class
        list.sort(null);

        System.out.println(list);
    }
}