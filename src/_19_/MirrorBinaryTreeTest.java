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
		p3.leftNext = null;
		p3.rightNext = p8;
		p4.leftNext = null;
		p4.rightNext = null;
		p5.leftNext = p6;
		p5.rightNext = p7;
		p6.leftNext = null;
		p6.rightNext = null;
		p7.leftNext = null;
		p7.rightNext = null;
		p8.leftNext = null;
		p8.rightNext = null;
		try {
			MirrorBinaryTree.mirror(p1);
			System.out.println(p7.leftNext.data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
