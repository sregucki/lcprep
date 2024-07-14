class Solution {
    public int findMinArrowShots(int[][] points) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < points.length; i++) {
            int[] currInterval = points[i];
            if (ans.isEmpty() || currInterval[0] > ans.get(ans.size() - 1)[1]) {
                ans.add(currInterval);
            } else {
                int[] mergedInterval = new int[] { Math.max(currInterval[0], ans.get(ans.size() - 1)[0]),
                        Math.min(currInterval[1], ans.get(ans.size() - 1)[1]) };
                ans.remove(ans.size() - 1);
                ans.add(mergedInterval);
            }
        }
        return ans.size();
    }
}