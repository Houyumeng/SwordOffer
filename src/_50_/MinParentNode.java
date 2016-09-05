package _50_;

/*
 * ��������������������С�������Ƚ��*/
public class MinParentNode {
	public static ListNode getMinParentNode(ListNode root, ListNode first, ListNode second) throws Exception{
		if(root==null){
			throw new Exception("Error:invalid input");
		}
		ListNode min = first;
		ListNode max = second;
		if(first.data>second.data){
			min = second;
			max = first;
		}
		if (root.data > max.data) {
			return getMinParentNode(root.left, first, second);
		} else if (root.data < min.data) {
			return getMinParentNode(root.right, first, second);
		}
		return root;
	}
}

class ListNode {
	int data;
	ListNode left;
	ListNode right;
}