package _22_;
/*���������������У���һ�����б�ʾѹ��˳���жϵڶ��������Ƿ�Ϊ����˳��.������ջ�������־������*/

import java.util.Stack;

public class IsPopOrder {

	public static boolean isPopOrder(int[] pushOrder, int[] popOrder) throws Exception {
		if (pushOrder == null || popOrder == null || pushOrder.length != popOrder.length) {
			throw new Exception("��������");
		}
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		stack.push(pushOrder[0]);
		for (int i = 0; i < popOrder.length;) {
			if (!stack.isEmpty()&&stack.peek() == popOrder[i]) {
				stack.pop();
				i++;
			} else {
				if (index < pushOrder.length) {
					stack.push(pushOrder[++index]);
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
