package chapter2;

public class _6_ConstructBinaryTreeTest {

	public static void main(String[] args) throws Exception {
		int[] preorder = { 1, 2, 4, 7,3,5,6,8 };
		int[] inorder = { 4, 7, 2, 1,5,3,8,6 };
		BinaryTreeNode root = null;
		root = _6_ConstructBinaryTree.construct(preorder, inorder);
		System.out.println(root);
	}

}
