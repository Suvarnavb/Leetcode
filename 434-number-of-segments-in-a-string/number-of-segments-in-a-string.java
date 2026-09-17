class Solution {
    public int countSegments(String s) {
        int count = 0;
        int length = s.length();

        for(int i = 0; i < length; i++) {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }

        return count;
    }
}