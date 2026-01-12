class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x = points[0][0], y = points[0][1], time = 0;
        for (int[] pt : points) {
            time += Math.max(Math.abs(x - pt[0]), Math.abs(y - pt[1]));
            x = pt[0];
            y = pt[1];
        }
        return time;
    }
}