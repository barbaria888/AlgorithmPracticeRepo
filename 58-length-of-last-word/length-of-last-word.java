class Solution {
    public int lengthOfLastWord(String s) {
        
        String ans="";
        int l=0;
        s=s.trim();

       for(int i=s.length()-1
       ;i>=0;i--) 
       {
        if(s.charAt(i)!=' ')
        {
            l++;
        }
        else if(l>0)
        {
            break;
        }
       }
       return l;
    }
}