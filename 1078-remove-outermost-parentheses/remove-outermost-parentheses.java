class Solution {
    public String removeOuterParentheses(String s) {
        Stack <Character> st= new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(st.size()>=1)
                {
                    ans+=s.charAt(i);
                }
                st.push(s.charAt(i));
            }
            else
            {
                if(st.size()>1)
                {
                    ans+=s.charAt(i);
                }
                st.pop();
            }
            }
            return ans;
        
    }
}