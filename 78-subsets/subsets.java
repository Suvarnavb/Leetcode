
import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] a) {

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for (int i = 0; i < a.length; i++) {
            int size = ans.size();

            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(a[i]);
                ans.add(temp);
            }
        }

        return ans;
    }
}
