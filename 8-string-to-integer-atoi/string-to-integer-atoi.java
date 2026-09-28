
class Solution {

    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        int i = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        return (int) solve(s, i, sign, 0);
    }

    public long solve(String s, int i, int sign, long num) {

        if (i == s.length()) {
            return num * sign;
        }

        char ch = s.charAt(i);

        if (ch < '0' || ch > '9') {
            return num * sign;
        }

        num = num * 10 + (ch - '0');

        if (num * sign > 2147483647) {
            return 2147483647;
        }

        if (num * sign < -2147483648) {
            return -2147483648L;
        }

        return solve(s, i + 1, sign, num);
    }
}