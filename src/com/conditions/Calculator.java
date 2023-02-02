package com.conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            // take the operator as input
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op == '+') {
                    System.out.println(num1 + num2);
                }
            }
        }
    }
}
