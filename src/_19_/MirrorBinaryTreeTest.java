package _19_;

public class MirrorBinaryTreeTest {

	public static void main(String[] args) {
		BinaryTreeNode p1 = new BinaryTreeNode();
		p1.data = 1;
		BinaryTreeNode p2 = new BinaryTreeNode();
		p2.data = 2;
		BinaryTreeNode p3 = new BinaryTreeNode();
		p3.data = 3;
		BinaryTreeNode p4 = new BinaryTreeNode();
		p4.data = 4;
		BinaryTreeNode p5 = new BinaryTreeNode();
		p5.data = 5;
		BinaryTreeNode p6 = new BinaryTreeNode();
		p6.data = 6;
		BinaryTreeNode p7 = new BinaryTreeNode();
		p7.data = 7;
		BinaryTreeNode p8 = new BinaryTreeNode();
		p8.data = 8;
		p1.leftNext = p2;
		p1.rightNext = p3;
		p2.leftNext = p4;
		p2.rightNext = p5;
		p3.rightNext = p8;
		p5.leftNext = p6;
		p5.rightNext = p7;
			MirrorBinaryTree.mirror(p1);
	}
}
