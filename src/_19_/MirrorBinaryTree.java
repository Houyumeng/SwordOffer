package _19_;

/*
 * 输出二叉树的镜像二叉树
 *交换非叶子结点的左右子结点*/
public class MirrorBinaryTree {
	public static void mirror(BinaryTreeNode root) throws Exception {
		if (root == null || root.leftNext == null && root.rightNext == null) {
			throw new Exception("输入异常");
		}
		BinaryTreeNode tempNode = root.leftNext;
		root.leftNext = root.rightNext;
		root.rightNext = tempNode;
		if (root.leftNext != null) {
			mirror(root.leftNext);

		}
		if (root.rightNext != null) {
			mirror(root.rightNext);

		}
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNext;
	BinaryTreeNode rightNext;
}