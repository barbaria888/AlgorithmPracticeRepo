class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int curr=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                max++;
            }
            else
            {   
                curr=curr>max?curr:max;
                max=0;
            }
        }
        return max>curr?max:curr;
    }
}