class Solution {
    public boolean hasGroupsSizeX(int[] deck) {

        int[] count = new int[10000];

        // Count frequency
        for (int i = 0; i < deck.length; i++) {
            count[deck[i]]++;
        }

        int gcd = 0;

        // Find GCD of all frequencies
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                gcd = findGCD(gcd, count[i]);
            }
        }

        return gcd >= 2;
    }

    public int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}