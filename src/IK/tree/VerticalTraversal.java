package IK.tree;

import java.util.*;

public class VerticalTraversal {
    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(verticalTraversal(root));
    }
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);
        //Pair auxPair = new Pair(0,0);
        HashMap<Integer, ArrayList<Integer>> hMap = new HashMap<>();
        hMap.put(0, new ArrayList<>(Arrays.asList(root.val)));
        int yIndexLeft = 0, yIndexRight = 0;
        while(queue.size()>0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    TreeNode tmpNode = node.left;
                    yIndexLeft =  yIndexLeft-1;
                    if(hMap.containsKey(yIndexLeft)){
                        hMap.get(yIndexLeft).add(tmpNode.val);
                    }else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(tmpNode.val);
                        hMap.put(yIndexLeft,temp);
                    }
                    queue.add(node.left);
                }
                if(node.right!=null){
                    TreeNode tmpNode  = node.right;
                    yIndexRight = yIndexRight+1;
                    if(hMap.containsKey(yIndexRight)){
                        hMap.get(yIndexRight).add(tmpNode.val);
                    }else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(tmpNode.val);
                        hMap.put(yIndexRight,temp);
                    }
                    queue.add(node.right);
                }
            }
        }
        for(Map.Entry<Integer,ArrayList<Integer>> entry : hMap.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
