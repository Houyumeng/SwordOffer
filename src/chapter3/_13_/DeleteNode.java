package chapter3._13_;

/*
 * �������������ͷָ���һ���ڵ㣬����һ��������O(1)ʱ��ɾ���ýڵ�
 */
public class DeleteNode {
	public static void deleteNode(ListNode pHead, ListNode pToBeDeleted) {
		if (pToBeDeleted == null || pHead == null) {
			return;
			// ɾ��ͷ���
		} else if (pHead.next == null && pToBeDeleted == pHead) {
			pHead = null;
		}
		// ɾ���Ĳ���β���
		else if (pToBeDeleted.next != null) {
			pToBeDeleted.data = pToBeDeleted.next.data;
			pToBeDeleted.next = pToBeDeleted.next.next;
			pToBeDeleted.next = null;
		}
		// ɾ��β���
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
// * �������������ͷָ���һ���ڵ㣬����һ��������O(1)ʱ��ɾ���ýڵ�
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
