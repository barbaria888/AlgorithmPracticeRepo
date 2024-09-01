class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> set=new HashMap<>();
        int count= 0;
        for(int i=0;i<nums.length;i++)
        { 
            if( set.containsKey(nums[i]) &&  ( i -set.get(nums[i] )) <= k)
            //if the set contains the current element and    INDEX OF THAT ELEMENT IN SET IS LESS THAN INDEX OF SET ELEMENT +K
            {
                return true;
            }
            set.put(nums[i],i);
    }
    return false;
    }
}