package _22_;
/*输入两个整数序列，第一个序列表示压入顺序，判断第二个序列是否为弹出顺序.
 * 假设入栈所有数字均不相等*/

import java.util.Stack;

public class IsPopOrder {

	public static boolean isPopOrder(int[] pushOrder, int[] popOrder) throws Exception {
		if (pushOrder == null || popOrder == null || pushOrder.length != popOrder.length) {
			throw new Exception("error:invalid input");
		}
		Stack<Integer> stack = new Stack<Integer>();
		int index = 0;
		int i =0;
		stack.push(pushOrder[0]);
		while(i<popOrder.length){
			if(!stack.isEmpty()&&stack.peek()==popOrder[i]){
				stack.pop();
				i++;
			}else{
				if(index<pushOrder.length-1){
					index=index+1;
					stack.push(pushOrder[index]);
				}else{
					return false;
				}
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		return false;
//		for (int i = 0; i < popOrder.length;) {
//			if (!stack.isEmpty()&&stack.peek() == popOrder[i]) {
//				stack.pop();
//				i++;
//			} else {
//				if (index < pushOrder.length) {
//					stack.push(pushOrder[++index]);
//				} else {
//					return false;
//				}
//			}
//		}
//		if (stack.isEmpty()) {
//			return true;
//		} else {
//			return false;
//		}

	}
}
