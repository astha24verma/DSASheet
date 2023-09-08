package Day1;

public class D1004KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        // Output - 6 (The subarray [4,-1,2,1] has the largest sum 6.)
        System.out.println(maxSubarraySum(arr));
    }
    public static long maxSubarraySum(int[] arr) {
        // write your code here
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        if(maxi < 0){
            return 0;
        }

        return maxi;
    }

}
