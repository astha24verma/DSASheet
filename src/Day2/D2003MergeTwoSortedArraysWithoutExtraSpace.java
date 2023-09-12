package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D2003MergeTwoSortedArraysWithoutExtraSpace {
    public static void main(String[] args) {
        long[] a = {1, 4, 5, 7};
        long[] b = {2, 3, 6};
        mergeTwoSortedArraysWithoutExtraSpace(a, b);

    }
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        // Write your code here.
        int n = a.length;
        int m = b.length;
        int left = n-1;
        int right = 0;
        while(left >= 0 && right < m){
            if(a[left] > b[right]){
                long temp = a[left];
                a[left] = b[right];
                b[right] = temp;

                left--;
                right++;
            }else{
                break;
            }

        }

        Arrays.sort(a);
        Arrays.sort(b);

        // Also can use Gap Method(from Shell Sort) for Optimal approach 2

        System.out.print(Arrays.toString(a));
        System.out.println(", " + Arrays.toString(b));

    }
}
