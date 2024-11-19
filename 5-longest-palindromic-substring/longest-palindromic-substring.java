class Solution {
    public static int check(int left,int right,String s)
    {
        if(left>right||s==null)
        {
            return 0;
        }
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
        
    }
    public String longestPalindrome(String s) {
        int right=0;
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            int same=check(i,i,s);
            int diff=check(i,i+1,s);
            int max=Math.max(same,diff);
            if(max>right-left)
            {
                left = i-(max-1)/2;
                right = i + max/2;
            }
        }

            return s.substring(left,right+1);
        
    }
}