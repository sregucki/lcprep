class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] currInterval = intervals[i];
            if (newInterval[1] < currInterval[0]) { // since intervals are sorted by start, each of remaining will not
                                                    // overlap
                res.add(newInterval);
                for (int j = i; j < intervals.length; j++) {
                    res.add(intervals[j]);
                }
                int[][] ans = new int[res.size()][2];
                return res.toArray(ans);
            } else if (newInterval[0] > currInterval[1]) {
                res.add(currInterval);
            } else {
                newInterval = new int[] { Math.min(newInterval[0], currInterval[0]),
                        Math.max(newInterval[1], currInterval[1]) };
            }
        }
        res.add(newInterval);
        int[][] ans = new int[res.size()][2];
        return res.toArray(ans);
    }
}