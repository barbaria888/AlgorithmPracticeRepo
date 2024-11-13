class Solution {
    public static int find(int []nums,int key)
    {
        for(int i=0;i<nums[i];i++)
        {
            if(nums[i]==key)
            {
                return i;
            }
        }
        return nums.length-1;

    }
    public int trap(int[] height) {
        int ans=0;
        Stack <Integer>st=new Stack<>();
        for(int i=0;i<height.length;i++)
        {
            while(!st.isEmpty() && height[st.peek()]<height[i])
            {
                int mid=st.pop();
                if(st.isEmpty())
                {
                    break;
                }
                int l=st.peek();
                int minH= Math.min(height[i]-height[mid], height[l]-height[mid]);
                int w= i-l-1;
                ans+= minH*w;
            }
            st.push(i);
        }

        return ans;
    }
}