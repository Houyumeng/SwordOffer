package _13_;

/*
 * 给定单向链表的头指针和一个结点，定义一个函数在O(1)时间删除该结点
 */
public class DeleteNode {
	public static void deleteNode(ListNode head, ListNode toBeDeleted) {
		if (toBeDeleted == null || head == null) {
			return;
			// 仅有一个结点删除头结点也是尾结点
		} else if (head.next == null && toBeDeleted == head) {
			head = null;
		}
		// 删除的不是尾结点
		else if (toBeDeleted.next != null) {
			toBeDeleted.data = toBeDeleted.next.data;
			toBeDeleted.next = toBeDeleted.next.next;
			toBeDeleted.next = null;
		}
		// 删除尾结点
		else {
			ListNode node = head;
			while (node.next != toBeDeleted) {
				node = node.next;
			}
			node.next = null;
		}
	}
}

class ListNode {
	int data;
	ListNode next;
}
// public class DeleteNode {
// /*
// * 给定单向链表的头指针和一个节点，定义一个函数在O(1)时间删除该节点
// */
//
// public void deleteNode(ListNode head,ListNode deListNode)
// {
// if(deListNode==null || head==null)
// return ;
// if(head==deListNode)
// {
// head=null;
// }
// else {
//
// if(deListNode.nextNode==null)
// {
// ListNode pointListNode=head;
// while(pointListNode.nextNode.nextNode!=null)
// {
// pointListNode=pointListNode.nextNode;
// }
// pointListNode.nextNode=null;
// }
// else
// {
// deListNode.data=deListNode.nextNode.data;
// deListNode.nextNode=deListNode.nextNode.nextNode;
// }
// }
// }
// }
// class ListNode
// {
// int data;
// ListNode nextNode;
// }
//
