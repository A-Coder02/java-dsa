package linearSearch;

import java.util.ArrayList;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,23,32,43,566,6,8};
//        System.out.println(Arrays.toString(arr));
        System.out.println(findNumbers(arr));
    }

    static ArrayList<Integer> evenDigits (int[] arr) {
        ArrayList<Integer> evenDigitsArr = new ArrayList<>();
        for(int elt : arr){
            if (elt % 2 == 0) {
                evenDigitsArr.add(elt);
            }
        }
        return  evenDigitsArr;
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(isEven2(num)){
                count++;
            }
        }
        return  count;
    }

    static boolean isEven(int num) {
        int length = 0;
        while (num  > 0){
            num/=10;
            length++;
        }
        return length % 2 == 0;
    }
    static boolean isEven2(int num) {
        int result = (int) (Math.log10(num) + 1);
        return result % 2 == 0;
    }
}
