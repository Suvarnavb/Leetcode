class Solution {
    public double myPow(double x, int n) {

        long num = n;

        if(num < 0) {
            num = -num;
            x = 1 / x;
        }

        if(num == 0) {
            return 1;
        }

        double half = myPow(x, (int)(num / 2));

        if(num % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }
    }
}