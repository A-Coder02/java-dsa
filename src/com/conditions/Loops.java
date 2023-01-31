package com.conditions;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

//        Scanner input  =  new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

//        int max = 0;
//        if(a>b){
//            max = a;
//        }
//        else {
//            max = b;
//        }
////        if()
//
//        System.out.println(max);

        Scanner input  =  new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max =  Math.max(a,Math.max(b,c));

        System.out.println(max);

    }
}
