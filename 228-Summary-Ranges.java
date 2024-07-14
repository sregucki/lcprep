class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            while (i + 1 < nums.length && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (i - start >= 1) {
                ans.add(String.valueOf(nums[start]) + \->\ + String.valueOf(nums[i]));
            } else {
                ans.add(String.valueOf(nums[start]));
            }
        }
        return ans;
    }
}