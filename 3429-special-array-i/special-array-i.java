class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(((nums[i+1]&1) ^ (nums[i]&1))==0)// if the both elementts are odd or even than only xor will be 0 that is the array is not special
            {
                return false;
            }
        }
        return true;
    }
}