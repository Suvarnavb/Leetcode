
class Solution {
    public int maxPoints(int[][] points) {

        int n = points.length;

        if (n <= 2) {
            return n;
        }

        int max = 0;

        for (int i = 0; i < n; i++) {

            int same = 1;

            for (int j = i + 1; j < n; j++) {

                int count = 0;

                long dx = points[j][0] - points[i][0];
                long dy = points[j][1] - points[i][1];

                for (int k = i; k < n; k++) {

                    long dx2 = points[k][0] - points[i][0];
                    long dy2 = points[k][1] - points[i][1];

                    if (dx * dy2 == dy * dx2) {
                        count++;
                    }
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
