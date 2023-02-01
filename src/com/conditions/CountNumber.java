package com.conditions;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int findNumber = in.nextInt();
        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if(findNumber == lastDigit) {
                count++;
            }
            number= number / 10;
        }
        System.out.println("count : " + count);
    }
}
