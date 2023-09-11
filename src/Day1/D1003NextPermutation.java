package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class D1003NextPermutation {

    public static void main(String[] args) {
        // Using Array
        int[] arr = {1, 2, 3};
        //Output - [1,3,2]
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

        // Using List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(0);
        list.add(0);
        //Output - [2, 3, 0, 0, 1, 4, 5]
        System.out.println(nextPermutation(list));
    }

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {
        int n = permutation.size();
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (permutation.get(i) < permutation.get(i + 1)) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            Collections.reverse(permutation);
            return permutation;
        }

        for (int i = n - 1; i > ind; i--) {
            if (permutation.get(i) > permutation.get(ind)) {
                //swap
                int temp = permutation.get(i);
                permutation.set(i, permutation.get(ind));
                permutation.set(ind, temp);
                break;
            }
        }

        List<Integer> sublist = permutation.subList(ind + 1, n);
        Collections.reverse(sublist);

        return permutation;
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }

        reverse(nums, ind + 1, n - 1);

    }

    public static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }

}
