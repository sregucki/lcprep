class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().toList());
        for (int num : nums) {
            int curSeq = 1;
            if (!set.contains(num - 1)) { // start of seq
                while (set.contains(num + 1)) {
                    curSeq++;
                    num++;
                }
                longest = Math.max(curSeq, longest);
            }
            if (longest > nums.length / 2) {
                return longest;
            }
        }
        return longest;
    }
}