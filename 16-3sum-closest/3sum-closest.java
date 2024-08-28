class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum =  nums[0] + nums[1] + nums[2];
        
        for(int i=0;i<nums.length-1;i++)
        
        { int j=i+1;
          int k=nums.length-1;
           while(j<k)
              {  

                
                   int currentSum = nums[i] + nums[j] + nums[k];
                  
                    if( Math.abs(target - currentSum) < Math.abs(target - closestSum)) 
                    {
                        
                        closestSum = currentSum;
                    }    
             if(currentSum<target)
                {
                    j++;
                }
                else
                {
                    k--;
                }
              }
        }

        return closestSum;
        
    }
}
