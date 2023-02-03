package functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
    // create an array
    int[] arr = {1, 3, 2, 45, 6};
        System.out.println(Arrays.toString(arr));
    change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num) {
        num[0] = 99;
    }

}
