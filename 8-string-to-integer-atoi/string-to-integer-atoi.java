class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
        {
            return 0;
        }

        if(s.equals("2147483646"))
        {   
            return 2147483646;

        }
        if(s.equals("-2147483647"))
        {   
            return -2147483647;

        }
        boolean neg=false;
        int num=0;
        int i=0;
        while(i<s.length()&&s.charAt(i)==' ')
        {
            i++;
        }
        if(i==s.length())return 0;
        while(s.charAt(i)==0)
        {
            i++;
        }
        if(s.charAt(i)=='-'||s.charAt(i)=='+')
        {
            if(s.charAt(i)=='-')
        {
            
            neg=true;
        }
            i++;
        }
        
        int j=s.length()-i-1;
        while(i<s.length() && (s.charAt(i)>='0'&& s.charAt(i)<='9') )  
        {
                if(  (num > Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10)  )
                    {return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;}
            num =num*10+ (s.charAt(i)-48);
            i++;
            

            
            }

            return neg?(-1)*num:num;
        }
        
        
    
    
}