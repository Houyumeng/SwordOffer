package chapter3._13_;

/*
 * 给定单向链表的头指针和一个节点，定义一个函数在O(1)时间删除该节点
 */
public class DeleteNode {
	public static void deleteNode(ListNode pHead, ListNode pToBeDeleted) {
		if (pToBeDeleted == null || pHead == null) {
			return;
			// 删除头结点
		} else if (pHead.next == null && pToBeDeleted == pHead) {
			pHead = null;
		}
		// 删除的不是尾结点
		else if (pToBeDeleted.next != null) {
			pToBeDeleted.data = pToBeDeleted.next.data;
			pToBeDeleted.next = pToBeDeleted.next.next;
			pToBeDeleted.next = null;
		}
		// 删除尾结点
		else {
			pToBeDeleted = pHead;
			while (pToBeDeleted.next.next != null) {
				pToBeDeleted = pToBeDeleted.next;
			}
			pToBeDeleted.next = null;
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
