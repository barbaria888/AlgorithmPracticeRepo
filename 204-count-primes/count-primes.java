class Solution {
    public int countPrimes(int n) {
        if(n<=2)
        {
            return 0;
        }
        int c=0;
        boolean primes[]=new boolean[n+1];
        Arrays.fill(primes,true);
        for(int i=2;i*i<n;i++)
        {
            
            if(primes[i])
            for(int j=i*i;j<n ;j+=i)
            {
                primes[j]=false;
            }
            
        }
        for(int i=2;i<n;i++)
        {
            if(primes[i])
            {
                c++;
            }
            
        }
        return c;
        
    }
}