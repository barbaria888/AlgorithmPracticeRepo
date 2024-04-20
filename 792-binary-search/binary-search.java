class Solution {
    public static int BinarySearch(int[]nums,int key,int start,int end)
    {
        int mid  =start +(end-start)/2;
        if(start>end)
        {
            return -1;
        }
        if(nums[mid]==key)
            {    return mid;}
        if(nums[mid]>key)
                return BinarySearch(nums,key,start,mid-1);
        return BinarySearch(nums,key,mid+1,end);
        
    }
    public int search(int[] nums, int target) {
        if(nums.length==1&&nums[0]==target)return 0;
        return BinarySearch(nums,target,0,nums.length-1);
    }
}