
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int total = 0;
        int sum = 0;

        for (int i = 0; i < distance.length; i++) {
            total = total + distance[i];
        }

        int i = start;

        while (i != destination) {

            sum = sum + distance[i];

            i = (i + 1) % distance.length;
        }

        int other = total - sum;

        return Math.min(sum, other);
    }
}
