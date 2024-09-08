class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0,count2 = 0;
        int eleA = Integer.MIN_VALUE, eleB = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
            if(count1 == 0 && eleB != nums[i]) {
                count1 = 1;
                eleA = nums[i];
            }
            else if(count2 == 0 && eleA != nums[i]) {
                count2 = 1;
                eleB = nums[i];
            }

            else if(nums[i] == eleA) count1++;
            else if(nums[i] == eleB) count2++;

            else {
                count1--;
                count2--;
            }
        } 

        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for(int num: nums) {
            if(num == eleA) count1++;
            if(num == eleB) count2++;
        }

        int mini = (n / 3) + 1;
        if(count1 >= mini)  ans.add(eleA);
        if(count2 >= mini)  ans.add(eleB);

        return ans; 
    }

    }
