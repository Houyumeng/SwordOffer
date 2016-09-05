package _23_;

public class PrintBinaryTreeTest {

	public static void main(String[] args) {

		BinaryTreeNode root1 = new BinaryTreeNode();
		root1.data = 1;

		BinaryTreeNode root2 = new BinaryTreeNode();
		root2.data = 2;

		BinaryTreeNode root3 = new BinaryTreeNode();
		root3.data = 3;

		BinaryTreeNode root4 = new BinaryTreeNode();
		root4.data = 4;

		BinaryTreeNode root5 = new BinaryTreeNode();
		root5.data = 5;

		BinaryTreeNode root6 = new BinaryTreeNode();
		root6.data = 6;

		BinaryTreeNode root7 = new BinaryTreeNode();
		root7.data = 7;

		root1.leftTreeNode = root2;
		root1.rightTreeNode = root3;
		
		root2.leftTreeNode = root4;
		root2.rightTreeNode = root5;
		
		root3.leftTreeNode = root6;
		root3.rightTreeNode = root7;

		try {
			PrintBinaryTree.printFromTopToBottom(root1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
