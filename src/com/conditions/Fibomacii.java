package com.conditions;

import java.util.Scanner;

public class Fibomacii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n) {
            int temp = b;
            System.out.print(a + " ");

            b +=a;
            a = temp;
            count++;
        }
}
}
