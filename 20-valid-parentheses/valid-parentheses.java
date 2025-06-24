import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> st = new Stack<>();
    for(int i=0;i<s.length();i++)
    {   char curr=s.charAt(i);
        if(curr== '('||curr== '['||curr== '{' )
        {
            st.push(curr);
        }
        else{
                if(st.isEmpty())return false;
                if(((st.peek()=='(')&&(curr==')'))||((st.peek()=='{')&&(curr=='}'))||((st.peek()=='[')&&(curr==']')))
        {st.pop();}
        else
         {
            return false;
            }
        }
    }
        if(!st.isEmpty())
            {
                return false;
            }

        return true;
    }
}