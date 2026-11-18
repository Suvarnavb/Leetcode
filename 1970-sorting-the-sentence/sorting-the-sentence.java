
class Solution {
    public String sortSentence(String s) {

        String a[] = s.split(" ");

        String result[] = new String[a.length];

        for (int i = 0; i < a.length; i++) {

            String word = a[i];

            int pos = word.charAt(word.length() - 1) - '0';

            result[pos - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", result);
    }
}
