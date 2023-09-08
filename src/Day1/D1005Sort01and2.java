package Day1;

import java.util.Arrays;

public class D1005Sort01and2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 0, 1, 0};
        sort012(arr);
    }

    // Sort an array of 0s, 1s and 2s | Dutch National Flag problem
    public static void sort012(int[] arr)
    {
        // Optimal | TC - O(N)
        // {0 ... low - 1}, {low ... mid - 1}, {mid ... high}, {high + 1 ... n - 1}
        //  0 0 0 0 0 0       1 1 1 1 1 1      {    0/1/2   }    2 2 2 2 2 2 2 2
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        int temp = 0;

        while(mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;

            } else if (arr[mid] == 2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
