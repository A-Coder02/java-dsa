package com.conditions;

public class Main {
    public static void main(String[] args) {
        // if statements
        int salary = 25_400;
        if(salary > 10000) {
            salary += 2000;
        }
        else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
