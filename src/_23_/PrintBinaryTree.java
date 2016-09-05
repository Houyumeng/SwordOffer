package _23_;

/*实现二叉树从上到下打印
 * 层序遍历 队列实现*/
import java.util.LinkedList;
import java.util.Queue;

public class PrintBinaryTree {
	public static void printFromTopToBottom(BinaryTreeNode root) throws Exception {

		if (root == null) {
			throw new Exception("输入有误!");
		}

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode nodeFront = queue.poll();
			System.out.print(nodeFront.data + "  ");

			if (nodeFront.leftTreeNode != null) {
				queue.add(nodeFront.leftTreeNode);
			}
			if (nodeFront.rightTreeNode != null) {
				queue.add(nodeFront.rightTreeNode);
			}

		}

	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftTreeNode;
	BinaryTreeNode rightTreeNode;
}