package array;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        int[][] arr = new int[3][];

        int[][] arr3 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(arr3));

        for(int j[] : arr3) {
            for (int k : j) {
                System.out.print(k);
            }
        }


    }
}
