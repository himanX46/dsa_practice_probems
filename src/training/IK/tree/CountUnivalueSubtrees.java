package training.IK.tree;

public class CountUnivalueSubtrees {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static int uniValSubtreeCount = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(5);
        if(root == null){
            System.out.println(0);
        }
        dfs(root);
        System.out.println(uniValSubtreeCount);
    }
    public static boolean dfs(TreeNode node){
        if(node.left == null && node.right == null){
            uniValSubtreeCount += 1;
            return true;
        }
        boolean iAmUnival = true;
        if(node.left != null){
            boolean lb = dfs(node.left);
            if(!lb || (node.val != node.left.val)){
                iAmUnival = false;
            }
        }
        if(node.right != null){
            boolean rb = dfs(node.right);
            if(!rb || (node.val != node.right.val)){
                iAmUnival = false;
            }
        }
        if(iAmUnival){
            uniValSubtreeCount += 1;
        }
        return iAmUnival;
    }
}
