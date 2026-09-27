package arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int [] nums = {2,5,6,2};

        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}
