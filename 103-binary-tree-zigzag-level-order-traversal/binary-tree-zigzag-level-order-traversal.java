
import java.util.*;

class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {

            int size = q.size();

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                temp.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (leftToRight == false) {
                Collections.reverse(temp);
            }

            ans.add(temp);

            leftToRight = !leftToRight;
        }

        return ans;
    }
}
