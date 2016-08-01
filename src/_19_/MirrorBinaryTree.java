package _19_;

/*
 * ����������ľ��������
 *������Ҷ�ӽ��������ӽ��*/
public class MirrorBinaryTree {
	public static void mirror(BinaryTreeNode root) throws Exception {
		if (root == null || root.leftNext == null && root.rightNext == null) {
			throw new Exception("�����쳣");
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