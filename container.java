class sf
{

    public static int maxArea(int[] height)
    {int left=0;
        int right =height.length -1;
        int area =0;
        while(right>=left)
        {
            int curr =Math.min(height[left],height[right]) * (right - left);
            System.out .println(curr);
            area = Math.max(curr,area);
            if(height[left]<height[right])
            {
                left++;
            }
            else if(height[left]>height[right])
            {
                right--;
            }
            else{
                left++;
                right--;
            }
        }

        return area;}


    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

}


