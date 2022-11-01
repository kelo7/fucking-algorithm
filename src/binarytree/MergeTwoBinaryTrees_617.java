package binarytree;

public class MergeTwoBinaryTrees_617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // 如果一棵树有，另一棵树没有，接上去
        if (root1 == null){
            return root2;
        }
        if (root2 == null){
            return root1;
        }
        // 两棵树都有的节点，叠加节点
        root1.val+=root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }
}
