class Solution {
    
    public static int find(int []nums,int ele)
    {
        int ind=0;
        while(nums[ind]!=ele && ind<nums.length-1)
        {
            ind++;
        }return ind;
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int []answer=new int [n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i])
            {
                int index=st.pop();
                answer[index]= i-index;
            }
        
            st.push(i);
        }
return answer;
    
    }
}