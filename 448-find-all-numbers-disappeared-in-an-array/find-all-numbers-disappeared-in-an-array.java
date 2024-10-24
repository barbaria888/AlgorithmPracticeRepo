class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          List<Integer> list = new ArrayList<>();
        int key = -1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]< 0)
            {
                key = nums[i]*-1-1;
            }
            else
            {
                key = nums[i]-1;
            }    
            if(nums[key]>0)
            {
                nums[key]=-nums[key];
            }            
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            };
        }
        return list;
    }
}