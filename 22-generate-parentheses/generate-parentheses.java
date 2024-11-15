class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> strArr=new ArrayList<>();
        generate(strArr,"",0,0,n);
        return strArr;

                    }
    public static void generate(List<String>strArr,String curr,int open,int close,   int n)
    {
        if(open==n&&close==n)
        {
            strArr.add(curr);
            return;
        }
        if(open<n)
        {
            generate(strArr,curr+"(",open+1,close,n);
        }
        if(close<open)
        {
            generate(strArr,curr+")",open,close+1,n);
        }
    }
    

}