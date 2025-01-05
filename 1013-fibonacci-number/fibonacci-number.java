import java.util.Arrays;
class Solution {
    public int helper(int n,int []dp)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int a=helper(n-1,dp);
        int b=helper(n-2,dp);
        dp[n]=a+b;
        return a+b;
        
    }
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        int[] dp=new int [n+1];
        Arrays.fill(dp,-1);
        return  helper(n,dp);
    }
}