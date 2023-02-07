package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
        int start = 1, end = 2;
        boolean result = searchInRange(arr, target, start, end);
        System.out.println(result);
    }

    static boolean searchInRange (int[] arr,int target, int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.println(arr[i]);
            if(arr[i] == target) {
                return  true;
            }
        }
        return  false;
    }
}
