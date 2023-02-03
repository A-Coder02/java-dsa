package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        swap(a,b);

        System.out.println(a);
        System.out.println(b);

        String name = "Arbaz Ansari";
//        changeName(name);


    }

    static int sum(int a, int b) {
         return a + b;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}
