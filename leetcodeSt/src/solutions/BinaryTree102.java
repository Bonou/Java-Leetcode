package solutions;

import java.util.ArrayList; 
import java.util.List;
import tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree102 {
	    public List<List<Integer>> resList = new ArrayList<List<Integer>>();

	    public List<List<Integer>> levelOrder(TreeNode root) {
	        checkFun02(root);
	        return resList;

	    }
	    public void checkFun02(TreeNode node){
	        if(node == null) return;
	        Queue <TreeNode> que = new LinkedList<TreeNode>();
	        que.offer(node);

	        while(!que.isEmpty()){
	            List<Integer> itemList = new ArrayList<Integer>();
	            int len = que.size();
	            
	            while(len > 0){
	                TreeNode tempNode = que.poll();
	                itemList.add(tempNode.val);

	                //判断当前结点是否有左右子结点，有的话，按左右顺序加入辅助队列
	                if(tempNode.left != null){
	                    que.offer(tempNode.left);
	                }
	                if(tempNode.right != null){
	                    que.offer(tempNode.right);
	                }
	                len--;
	            }
	            resList.add(itemList);      //将当前层的结点存入resList中
	        }

	    }

}
