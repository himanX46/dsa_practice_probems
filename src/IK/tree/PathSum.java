package IK.tree;

public class PathSum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        if(root == null){
            System.out.println(false);
        }
        boolean b = dfs(root,22);
        System.out.println(b);
    }
    static boolean dfs(TreeNode node, int target){
        if(node.left==null && node.right==null){
            if(node.val == target){
                return true;
            }
            return false;
        }
        boolean left = false, right = false;
        if(node.left!=null){
            left = dfs(node.left,target-node.val);
        }
        if(node.right!=null){
            right = dfs(node.right,target-node.val);
        }
        return left || right;
    }
}
