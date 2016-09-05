package _25_;

import java.util.Stack;
/*
 * �������������Ҷ�ӽ���·��֮�͵���expectedSum��·��*/

public class FindPath {
	public static void findPath(BinaryTreeNode root, int expectedSum) throws Exception {
		if (root == null) {
			throw new Exception("��������");
		}
		Stack<Integer> path = new Stack<>();
		findPath(root, expectedSum, path);
	}

	private static void findPath(BinaryTreeNode root, int expectedSum, Stack<Integer> path) throws Exception {
		if (root == null) {
			throw new Exception("error:invalid input!");
		}
		if (root.leftTreeNode == null && root.rightTreeNode == null) {
			if (root.data == expectedSum) {
				System.out.println("path start:");
				for (int i : path) {
					System.out.print(i + ", ");
				}
				System.out.print(root.data);
				System.out.println();
			}
		} else {
			path.push(root.data);
			findPath(root.leftTreeNode, expectedSum - root.data, path);
			findPath(root.rightTreeNode, expectedSum - root.data, path);
			path.pop();
		}
	}
}

class BinaryTreeNode {
	int data;
	BinaryTreeNode leftTreeNode;
	BinaryTreeNode rightTreeNode;

}
/*
 * public class FindPath {
 * 
 * public void findPath(BinaryTreeNode root, int k) { if (root == null) return;
 * Stack<Integer> stack = new Stack<Integer>(); findPath(root, k, stack); }
 * 
 * private void findPath(BinaryTreeNode root, int k, Stack<Integer> path) { if
 * (root == null) return; if (root.leftNode == null && root.rightNode == null) {
 * if (root.data == k) { System.out.println("·����ʼ"); for (int i : path)
 * System.out.println(i); System.out.println(root.data); } // ��ӡջ } else {
 * path.push(root.data); findPath(root.leftNode, k - root.data, path);
 * findPath(root.rightNode, k - root.data, path); path.pop(); } } }
 */