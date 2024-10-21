class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans= new int [nums1.length+nums2.length];
        int j=0;
        for(int num:nums1)
        {
            ans[j++]=num;
        }
        for(int num:nums2)
        {
            ans[j++]=num;
        }
        Arrays.sort(ans);
        if(ans.length%2!=0)
        {
            return (double)ans[(ans.length)/2];
        }
        return (double)(ans[(ans.length-1)/2] + ans[(ans.length-1)/2+1])/2;


    }
}