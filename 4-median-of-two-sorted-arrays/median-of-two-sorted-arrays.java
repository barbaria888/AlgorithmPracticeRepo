class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans= new int [nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                ans[k++]=nums1[i++];
            }
            else
            {
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            ans[k++]=nums2[j++];
        }
        if(ans.length%2==0)
        {
            return ((ans[ans.length/2])+ans[(ans.length/2)-1])/2.0;
        }
        return ans[ans.length/2];


    }
}