class Solution {
    public int Binary(int[]nums,int target,boolean last)
    {
        int start= 0;
        int end= nums.length-1;
        int ans= -1;
        while(start<=end)
        {
            int mid= (start+end)>>1;
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end= mid-1;
            }
            else
            {
                ans=mid;
                if(last)
                {
                    start =mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            }    
             return ans;
    }
       
    
    public int[] searchRange(int[] nums, int target) {
        
        int first=Binary(nums,target,false);
        int last=Binary(nums,target,true);
        int[] ans=new int[2];
        return new int[]{first,last};
    }
}