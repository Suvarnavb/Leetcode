class Solution {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();

        String str = s + "#" + rev;

        int[] lps = new int[str.length()];

        int len = 0;

        for (int i = 1; i < str.length();) {

            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else {
                if (len > 0) {
                    len = lps[len - 1];
                } 
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        int n = lps[str.length() - 1];

        return rev.substring(0, s.length() - n) + s;
    }
}