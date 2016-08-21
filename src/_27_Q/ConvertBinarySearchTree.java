package _27_Q;

/*
 * 输入一颗二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建新的结点，只能调整树中结点指针的指向。*/
public class ConvertBinarySearchTree {
	public static BinaryTreeNode convert(BinaryTreeNode root) {
		BinaryTreeNode lastNode = null;
		lastNode = baseconvert(root, lastNode);
		BinaryTreeNode headNode = lastNode;
		while (headNode.leftNode != null) {
			headNode = headNode.leftNode;
		}
		return headNode;
	}

	public static BinaryTreeNode baseconvert(BinaryTreeNode root, BinaryTreeNode lastNode) {
		if (root == null) {
			return lastNode;
		}
		BinaryTreeNode current = root;
		if (current.leftNode != null) {
			lastNode = baseconvert(current.leftNode, lastNode);
		}
		current.leftNode = lastNode;
		if (lastNode != null) {
			lastNode.rightNode = current;
		}
		lastNode = current;
		if (current.rightNode != null) {
			lastNode = baseconvert(current.rightNode, lastNode);
		}
		return lastNode;
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}
