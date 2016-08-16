package _18_;

//Ê÷1ÖÐÊÇ·ñ°üº¬Ê÷2
public class HasSubTree {
	public static boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		boolean result = false;

		if (root1 != null & root2 != null) {
			if (root1.data == root2.data) {
				result = doesTree1HasTree2(root1, root2);
			}
			if (!result) {
				result = hasSubTree(root1.leftNode, root2);
			}
			if (!result) {
				result = hasSubTree(root1.rightNode, root2);
			}
		}
		return result;
	}

	public static boolean doesTree1HasTree2(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root1 == null) {
			return false;
		}
		if (root2 == null) {
			return true;
		}
		if (root1.data != root2.data) {
			return false;
		}
		return doesTree1HasTree2(root1.leftNode, root2.leftNode) && doesTree1HasTree2(root1.rightNode, root2.rightNode);
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}