package _13_;

/*
 * �������������ͷָ���һ����㣬����һ��������O(1)ʱ��ɾ���ý��
 */
public class DeleteNode {
	public static void deleteNode(ListNode head, ListNode toBeDeleted) {
		if (toBeDeleted == null || head == null) {
			return;
			// ����һ�����ɾ��ͷ���Ҳ��β���
		} else if (head.next == null && toBeDeleted == head) {
			head = null;
		}
		// ɾ���Ĳ���β���
		else if (toBeDeleted.next != null) {
			toBeDeleted.data = toBeDeleted.next.data;
			toBeDeleted.next = toBeDeleted.next.next;
			toBeDeleted.next = null;
		}
		// ɾ��β���
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
