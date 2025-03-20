import java.util.*;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        for ( int i=0; i<nums.length ; i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {0,2,1,5,3,4};
        int[] result1 = solution.buildArray(nums1);
        System.out.println(Arrays.toString(result1)); // Output: [0,1,2,4,5,3]

        // Example 2
        int[] nums2 = {5,0,1,2,3,4};
        int[] result2 = solution.buildArray(nums2);
        System.out.println(Arrays.toString(result2)); // Output: [4,5,0,1,2,3]
    }
}
