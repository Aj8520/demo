package com.example.demo.javaprep.Stream.self35;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {

                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (ch == '}') {

                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else if (ch == ']') {

                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid1(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {

            switch (ch) {

                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String str = "{[()]}";

        System.out.println(isValid(str));
    }
}