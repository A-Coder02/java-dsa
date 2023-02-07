package linearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 100;
        System.out.println(search(arr, target));
    }

    static int search (int[][] arr, int target) {
        for (int[] rowArr : arr) {
            for(int rowElt : rowArr) {
                if(rowElt == target) {
                    return rowElt;
                }
            }
        }
        return -1;
    }
}
