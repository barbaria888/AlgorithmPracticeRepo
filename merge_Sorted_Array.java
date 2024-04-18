import java.util.Arrays;

class merge_Sorted_Array {
    public static int[] mergethesorted(int[] nums1, int m, int[] nums2, int n) {
        if(m==0&&n==1)
        {
            nums1[0]=nums2[0];return null;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            nums1[k--]= nums1[i] > nums2[j] ?nums1[i--]:nums2[j--];
        }
        while (j >= 0)
        {
            nums1[k--] = nums2[j--];
        }
    return nums1;}

    //n-m elements in nums1;
    //n
    public static int [] mergeIT(int[] nums)
    {
            int []ans =new int[nums.length];
        int start=0;
        int end = nums.length-1;
        for (int i =nums.length-1;i>=0 ; i--)
        {
            if(Math.abs(nums[start])>Math.abs(nums[end]))
            {
                ans[i] = nums[start] * nums[start];
                start++;
            }
            else
            {
                ans[i] = nums[end]*nums[end];
                end--;
            }
        }

    return ans  ;

    }
     public static void main(String[] args) {
         //System.out.println(Arrays.toString(mergethesorted( new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3)));
         System.out.println(Arrays.toString(mergeIT( new int[]{-4,-1,0,3,10})));
     }
 }
