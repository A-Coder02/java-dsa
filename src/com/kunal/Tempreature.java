package com.kunal;

import java.util.Scanner;

public class Tempreature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float result = (input.nextFloat() * 9/5) + 32;

        System.out.println(result);
    }
}
