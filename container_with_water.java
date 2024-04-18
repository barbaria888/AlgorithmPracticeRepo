import java.util.Arrays;

class arrrle{
    public static int maxArea(int[] height) {
        int max = height[0];
        int secondMax = max;

        for (int num : height)
        {
            if (num > max) {
                secondMax = max;
                max = num;
            }
            else if (num > secondMax && num != max)
            {
                secondMax = num;
            }
        }
        return (max - secondMax)*secondMax;
    }
    public static int removeduplicates(int []nums)
    {
        int j=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                    nums[j]=nums[i];
                    j++;
            }
        }
        for(int i=0;i<=j;i++)
        System.out.print(nums[i]);
        return j;

    }
    public static void main(String[] args) {
        System.out.println(removeduplicates(new int [] {1,1,5}));
        //System.out.println(Arrays.toString());
    }
}