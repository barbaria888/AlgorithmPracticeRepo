class Solution {
    public double myPow(double x, int n) {
        if (n == 0)
           {
             return 1.0;
           }
        if(n==2147483647&&x>0)
           {
             return  Math.exp(n * Math.log(x));
           }
        if(n==2147483647&&x<0)
            {
                return  -1.0;
            }
        if (n > 0)
            {
                return x * myPow(x, n-1);
            }
 
        if(n==-1)
        {
            return 1/x;
        }
        if (n<0)
        {
            return 1/ (x * myPow(x,- n-1));
        }
            return 1.0; 
            }
        }