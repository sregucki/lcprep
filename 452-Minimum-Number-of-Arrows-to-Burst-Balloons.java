class Solution {
    public int findMinArrowShots(int[][] points) {
        int res = 1;
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int[] last = points[0];
        for (int i = 1; i < points.length; i++) {
            int[] currInterval = points[i];
            if (currInterval[0] > last[1]) {
                res++;
                last = currInterval;
            } else {
                int[] mergedInterval = new int[] { Math.max(currInterval[0], last[0]),
                        Math.min(currInterval[1], last[1]) };
                last = mergedInterval;
            }
        }
        return res;
    }
}