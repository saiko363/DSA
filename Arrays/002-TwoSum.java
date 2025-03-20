//Normal Approach O(n*n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        for ( i=0; i< nums.length-1;i++)
        {
            int a=target-nums[i];
            for( j=i+1; j<nums.length;j++)
            {
                if ( a== nums[j])
                {
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};

    }
}

// Using O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hp = new HashMap<>();
        for ( int i=0; i< nums.length;i++)
        {
            int comp = target - nums[i];
            if(hp.containsKey(comp))
            {
                return new int[] {hp.get(comp),i};
            }
            else
            {
                hp.put(nums[i],i);
            }
        }
        return new int[] {};

    }
}