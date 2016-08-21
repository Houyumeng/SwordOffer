package _27_Q;

/*
 * ����һ�Ŷ��������������ö���������ת����һ�������˫������
 * Ҫ���ܴ����µĽ�㣬ֻ�ܵ������н��ָ���ָ��*/
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
