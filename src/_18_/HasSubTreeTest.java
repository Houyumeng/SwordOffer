package _18_;

public class HasSubTreeTest {

	public static void main(String[] args) {
		BinaryTreeNode root1 = new BinaryTreeNode();
		root1.data = 8;
		BinaryTreeNode root2 = new BinaryTreeNode();
		root2.data = 8;
		BinaryTreeNode root3 = new BinaryTreeNode();
		root3.data = 7;
		BinaryTreeNode root4 = new BinaryTreeNode();
		root4.data = 9;
		BinaryTreeNode root5 = new BinaryTreeNode();
		root5.data = 2;
		BinaryTreeNode root6 = new BinaryTreeNode();
		root6.data = 4;
		BinaryTreeNode root7 = new BinaryTreeNode();
		root7.data = 7;
		root1.leftNode = root2;
		root1.rightNode = root3;
		root3.leftNode = root4;
		root3.rightNode = root5;
		root5.leftNode = root6;
		root5.rightNode = root7;
		root7.leftNode = null;
		root7.rightNode = null;
		root4.leftNode = null;
		root4.rightNode = null;
		root6.leftNode = null;
		root6.rightNode = null;
		root7.leftNode = null;
		root7.rightNode = null;
		BinaryTreeNode root21 = new BinaryTreeNode();
		root21.data = 8;
		BinaryTreeNode root22 = new BinaryTreeNode();
		root22.data = 9;
		BinaryTreeNode root23 = new BinaryTreeNode();
		root23.data = 2;
		root21.leftNode = root22;
		root21.rightNode = root23;
		root22.leftNode = null;
		root22.rightNode = null;
		root23.leftNode = null;
		root23.rightNode = null;
		boolean result = HasSubTree.hasSubTree(root1, root21);
		System.out.println(result);
	}

}
