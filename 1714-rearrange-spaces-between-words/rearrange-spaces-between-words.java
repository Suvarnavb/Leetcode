class Solution {
    public String reorderSpaces(String text) {

        int spaces = 0;

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                spaces++;
            }
        }

        String words[] = text.trim().split("\\s+");

        int gaps = words.length - 1;

        if(gaps == 0) {
            return words[0] + " ".repeat(spaces);
        }

        int equalSpaces = spaces / gaps;
        int extraSpaces = spaces % gaps;

        String result = "";

        for(int i = 0; i < words.length; i++) {
            result = result + words[i];

            if(i < words.length - 1) {
                result = result + " ".repeat(equalSpaces);
            }
        }

        result = result + " ".repeat(extraSpaces);

        return result;
    }
}