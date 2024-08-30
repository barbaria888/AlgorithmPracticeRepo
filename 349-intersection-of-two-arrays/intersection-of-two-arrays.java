 class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> arr=new HashSet<>();
        Set<Integer> ans=new HashSet<>();

        for(int i=0;i<nums1.length;i++)
         {
            arr.add(nums1[i]);
          }

         int k=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(arr.contains(nums2[i]))
            {
                ans.add(nums2[i]);
                arr.remove(nums2[i]);
            }
        }
       int out[]=new int[ans.size()];
      
      int index = 0;
        for (int num : ans) {
            out[index++] = num;
        }
       return out;



    }
}