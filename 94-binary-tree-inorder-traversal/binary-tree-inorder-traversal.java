
import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        // 1. Visit Left
        inorder(root.left, result);

        // 2. Visit Root
        result.add(root.val);

        // 3. Visit Right
        inorder(root.right, result);
    }
}
