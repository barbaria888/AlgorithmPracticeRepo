
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int right=Math.max(arr1.length,arr2.length);
        int left=0;
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
            boolean f=false;
            for(int j=0;j<arr2.length && !f ;j++)
            {
                if(Math.abs(arr1[i]-arr2[j])<=d)
                {
                 f=true;
                }
                
            }
            if(!f)
                {
                    c++;
                }
        }
        return c; 
    }
    
}