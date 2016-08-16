package _39_;

public class TreeDepthTest {

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

		root1.left = root2;
		root1.right = root3;
		root2.left = root4;
		root2.right = root5;
		int length = TreeDepth.getTreeDepth(root1);
		System.out.println(length);
		boolean b = TreeDepth.isAVL(root1, 3);
		System.out.println(b);
	}

}
