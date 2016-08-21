package _27_Q;

public class ConvertBinarySearchTreeTest {

	public static void main(String[] args) {
		BinaryTreeNode node1 = new BinaryTreeNode();
		node1.data = 8;
		BinaryTreeNode node2 = new BinaryTreeNode();
		node2.data = 6;
		BinaryTreeNode node3 = new BinaryTreeNode();
		node3.data = 10;
		BinaryTreeNode node4 = new BinaryTreeNode();
		node4.data = 2;
		BinaryTreeNode node5 = new BinaryTreeNode();
		node5.data = 7;
		node1.leftNode = node2;
		node1.rightNode = node3;
		node2.leftNode = node4;
		node2.rightNode = node5;
		BinaryTreeNode resultNode = ConvertBinarySearchTree.convert(node1);
		System.out.println(node1.leftNode.data);
	}

}
