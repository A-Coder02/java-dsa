package linearSearch;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {3,4,5,-2,21,};
        System.out.println(Arrays.toString(arr));
        System.out.println(minNumber(arr));
    }

    static int minNumber (int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if(i < min) {
                min  = i;
            }
        }
        return min;
    }

}
