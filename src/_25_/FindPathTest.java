package _25_;

public class FindPathTest {

	public static void main(String[] args) {
		BinaryTreeNode root1 = new BinaryTreeNode();
		root1.data = 10;
		BinaryTreeNode root2 = new BinaryTreeNode();
		root2.data = 5;
		BinaryTreeNode root3 = new BinaryTreeNode();
		root3.data = 12;
		BinaryTreeNode root4 = new BinaryTreeNode();
		root4.data = 4;
		BinaryTreeNode root5 = new BinaryTreeNode();
		root5.data = 7;

		root1.leftTreeNode = root2;
		root1.rightTreeNode = root3;
		root2.leftTreeNode = root4;
		root2.rightTreeNode = root5;
		root3.leftTreeNode = null;
		root3.rightTreeNode = null;
		root4.leftTreeNode = null;
		root4.rightTreeNode = null;
		root5.leftTreeNode = null;
		root5.rightTreeNode = null;

		try {
			FindPath.findPath(root1, 22);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
