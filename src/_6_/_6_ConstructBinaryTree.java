package _6_;

import java.util.Arrays;
//未实现输入出现相同数时报错，和两遍历量分别相等
public class _6_ConstructBinaryTree {
	public static BinaryTreeNode construct(int[] preorder, int[] inorder) throws Exception {
		if (preorder == null || inorder == null) {
			return null;
		}
		if (preorder.length != inorder.length) {
			throw new Exception("输入有误");
		}

		BinaryTreeNode root = new BinaryTreeNode();
		root.data = preorder[0];
		for (int i = 0; i < inorder.length; i++) {
			if (root.data == inorder[i]) {
				if (i > 0) {
					root.leftNode = construct(Arrays.copyOfRange(preorder, 1, i + 1),
							Arrays.copyOfRange(inorder, 0, i));
				}
				if (i < inorder.length - 1)
					root.rightNode = construct(Arrays.copyOfRange(preorder, i + 1, preorder.length),
							Arrays.copyOfRange(inorder, i + 1, inorder.length));
			}
		}
		return root;
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}