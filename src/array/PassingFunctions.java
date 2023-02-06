package array;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4};

        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int arr[]) {
        arr[0] = 99;
    }
}
