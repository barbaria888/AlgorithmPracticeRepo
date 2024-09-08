class Solution {
    public int majorityElement(int[] nums) {
     int c= 0;
     int can = nums[0];
     if(nums.length==1)
     {
        return nums[0];
     }
     for (int i=0;i<nums.length;i++)
     {
        if(c==0)
        {
            can = nums[i];
        }
        if(nums[i]==can)
        {
            c++;
        }
        else
        {
            c--;
        }
     }
     return can;
    }
}