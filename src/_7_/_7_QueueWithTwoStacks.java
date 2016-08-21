package _7_;

import java.util.Stack;

//����ջʵ�ֶ���
public class _7_QueueWithTwoStacks<T> {
	private Stack<T> s1 = new Stack<>();
	private Stack<T> s2 = new Stack<>();

	// ��β�������
	public void appendTail(T element) {
		s1.push(element);
	}

	// ����ɾ������
	public T deleteHead() throws Exception {
		if (s2.isEmpty()) {
			while (!s1.empty()) {
				s2.push(s1.pop());
			}
		}
		if (s2.isEmpty()&&s1.isEmpty()) {
			throw new Exception("queue is empty!");
		}
		return s2.pop();
	}
}
