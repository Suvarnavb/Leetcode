class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String result = "";

        for (int row = 0; row < numRows; row++) {

            int i = row;

            while (i < s.length()) {
                result = result + s.charAt(i);

                int down = 2 * (numRows - row - 1);
                int up = 2 * row;

                if (row != 0 && row != numRows - 1 && i + down < s.length()) {
                    result = result + s.charAt(i + down);
                }

                i = i + 2 * (numRows - 1);
            }
        }

        return result;
    }
}