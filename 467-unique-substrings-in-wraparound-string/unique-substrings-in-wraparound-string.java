
class Solution {
    public int findSubstringInWraproundString(String s) {

        int arr[] = new int[26];

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && 
                (s.charAt(i) - s.charAt(i - 1) == 1 ||
                 s.charAt(i - 1) == 'z' && s.charAt(i) == 'a')) {

                count++;
            } else {
                count = 1;
            }

            int index = s.charAt(i) - 'a';

            arr[index] = Math.max(arr[index], count);
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            ans += arr[i];
        }

        return ans;
    }
}
