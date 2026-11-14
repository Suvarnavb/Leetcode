
import java.util.*;

class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> ans = new ArrayList<>();

        List<String> temp = new ArrayList<>();

        solve(s, 0, temp, ans);

        return ans;
    }

    public void solve(String s, int index,
                      List<String> temp,
                      List<String> ans) {

        if (temp.size() == 4) {

            if (index == s.length()) {
                ans.add(String.join(".", temp));
            }

            return;
        }

        for (int len = 1; len <= 3; len++) {

            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            // Leading zero condition
            if (part.length() > 1 && part.charAt(0) == '0') {
                break;
            }

            int num = Integer.parseInt(part);

            // Range condition
            if (num > 255) {
                break;
            }

            temp.add(part);

            solve(s, index + len, temp, ans);

            temp.remove(temp.size() - 1);
        }
    }
}
