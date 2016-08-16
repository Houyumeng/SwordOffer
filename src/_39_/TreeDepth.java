package _39_;

public class TreeDepth {
	// 求二叉树深度
	public static int getTreeDepth(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = getTreeDepth(root.left);
		int right = getTreeDepth(root.right);
		return left > right ? left + 1 : right + 1;
	}

	// 判断二叉树是否是平衡二叉树
	public static boolean isAVL(BinaryTreeNode root, int depth) {
		if (root == null) {
			depth = 0;
			return true;
		}
		int left = 0;
		int right = 0;
		if (isAVL(root.left, left) && isAVL(root.right, right)) {
			int dif = left - right;
			if (dif <= 1 && dif >= -1) {
				depth = 1 + (left > right ? left : right);
				return true;
			}
		}
		return false;
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
}
