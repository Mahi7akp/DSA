package arrays;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i=1; i< nums.length; i++){
            int oldMax = max;
            int oldMin = min;
            max = Math.max(nums[i],Math.max(nums[i]*oldMax,nums[i]*oldMin));
            min = Math.min(nums[i],Math.min(nums[i]*oldMax,nums[i]*oldMin));
            result = Math.max(max, result);
        }
        return result;
    }

    public static void main(String[] args){
        int [] nums = {2,3,-2,9};
        int result = maxProduct(nums);
        System.out.println(result);
    }
}


//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
//Example 2:
//
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
//