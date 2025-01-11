class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        for(int i:nums)
        {
            if(i==target)
            {
                return hm.get(i);
            }
        }
        return -1;
        }
}