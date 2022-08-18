package solutions;

import tree.TreeNode;
import tree.TreeNodeUtil;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6,7};
		TreeNode root = TreeNodeUtil.arrayToTreeNode(arr);
		ldr(root);
	}
	
	
//ÖÐÐò±éÀú
	public static void ldr(TreeNode root) {
		if(root == null) {
			return;
		}
		
		ldr(root.left);
		System.out.println(root.val);
		ldr(root.right);
	}

}
