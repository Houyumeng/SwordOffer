package _23_;
//实现二叉树从上到下打印
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
			System.out.print(nodeFront.data+"  ");
			if (nodeFront.leftTreeNode != null) {
				queue.add(nodeFront.leftTreeNode);
			}
			if (nodeFront.rightTreeNode != null) {
				queue.add(nodeFront.rightTreeNode);
			}

		}

	}
}

// public class PrintFromTopToBottom<K> {
// public <E> void printFromTopToBottom(BinaryTreeNode<K> root)
// {
// if(root!=null)
// return ;
// Queue<BinaryTreeNode<K>> queue=new LinkedList<BinaryTreeNode<K>>();
// queue.add(root);
// while(!queue.isEmpty())
// {
// BinaryTreeNode<K> node=queue.poll();
// System.out.println(node.data);
// if(node.leftNode!=null)
// queue.add(node.leftNode);
// if(node.rightNode!=null)
// queue.add(node.rightNode);
// }
// }
// }
// class BinaryTreeNode <K>
// {
// K data;
// BinaryTreeNode<K> leftNode;
// BinaryTreeNode<K> rightNode;
// }

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftTreeNode;
	BinaryTreeNode rightTreeNode;
}