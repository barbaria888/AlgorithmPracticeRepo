class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1=0,xor2=0;
        int n=nums1.length;
        int m=nums2.length;
        if(n%2!=0)
        {
            for(int x:nums2)
            {
                xor1^=x;
            }
        }
        if(m%2!=0)
        {
            for(int x:nums1)
            {
                xor2^=x;
            }
        }
        return xor1^xor2;
    }
}