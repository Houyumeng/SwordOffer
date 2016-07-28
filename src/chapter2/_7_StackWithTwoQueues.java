package chapter2;

import java.util.LinkedList;
import java.util.Queue;
//两个队列实现栈功能
public class _7_StackWithTwoQueues<T> {
	private Queue<T> q1 = new LinkedList<>();
	private Queue<T> q2 = new LinkedList<>();

	// 进栈操作
	public void push(T element) {
		if (q2.size() == 0) {
			q1.add(element);
		} else {
			q2.add(element);
		}
	}
	// 出栈操作
	public T pop() {
		if (q2.size() == 0) {
			while (q1.size() > 1) {
				q2.add(q1.poll());
			}
			return q1.poll();
		} else {
			while (q2.size() > 1) {
				q1.add(q2.poll());
			}
			return q2.poll();
		}
	}

}
