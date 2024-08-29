class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long sum =(long) nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        int low = nums[start];
                        int high = nums[end];
                        start++;
                        end--;
                        while (start < end && nums[start] == low) start++;
                        while (start < end && nums[end] == high) end--;
                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }
        return ans;
    }
}