import jianzhioffer.Solution;
import jianzhioffer.TreeNode;

public class Main {

    public static void main(String[] args) {
        Solution solution =new Solution();
        TreeNode t10 =new TreeNode(10);
        TreeNode t5 =new TreeNode(5);
        TreeNode t7 =new TreeNode(7);
        TreeNode t12 =new TreeNode(12);
        TreeNode t4 =new TreeNode(4);
        t10.left = t5;
        t5.left =t7;
        t10.right = t12;
        solution.FindPath(t10,22);
    }
}
