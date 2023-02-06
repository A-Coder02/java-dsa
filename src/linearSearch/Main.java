package linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        int target = 5;
        System.out.println(linearSearch(nums,target));
        System.out.println(linearSearchElement(nums,target));
        System.out.println(linearSearchBool(nums,target));
    }

    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return  Integer.MAX_VALUE;
        }

        // run for loop
        for(int i : arr) {
            // check for element at every index if it is target
            int elt = arr[i];

            if(elt == target) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }

    static int linearSearchElement(int[] arr, int target) {
        if(arr.length == 0) {
            return  Integer.MAX_VALUE;
        }

        // run for loop
        for(int i : arr) {
            // check for element at every index if it is target
            int elt = arr[i];

            if(elt == target) {
                return elt;
            }
        }

        return Integer.MAX_VALUE;
    }

    static boolean linearSearchBool(int[] arr, int target) {
        if(arr.length == 0) {
            return  false;
        }

        // run for loop
        for(int i : arr) {
            // check for element at every index if it is target
            int elt = arr[i];

            if(elt == target) {
                return true;
            }
        }

        return false;
    }
}
