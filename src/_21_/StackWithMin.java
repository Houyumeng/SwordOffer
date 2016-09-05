package _21_;

/*����ջ���ݽṹ��ʵ���ܹ��ҵ�ջ����СԪ�ص�min()  ���ҵ���ʱ�临�Ӷ�ΪO(1)*/
import java.util.Stack;

public class StackWithMin<T extends Comparable<? super T>> {
	// ����ջ���洢����
	Stack<T> sData = new Stack<>();
	// ����ջ���洢��Сֵ
	Stack<T> sMin = new Stack<>();

	public void pushNew(T element) {

		sData.push(element);
		// sMinΪ�ջ������Ԫ�ر�sMinջ��Ԫ��С
		if (sMin.size() == 0 || element.compareTo(sMin.peek()) < 0) {
			sMin.push(element);
		} else {
			sMin.push(sMin.peek());
		}
	}

	public void popNew() throws Exception {
		if (sData.size() > 0 && sMin.size() > 0) {
			sData.pop();
			sMin.pop();
		} else {
			throw new Exception("��ջ���ܵ���Ԫ�أ�");
		}
	}

	public T min() {
		if (sData.size() > 0 && sMin.size() > 0) {
			return sMin.peek();
		} else {
			return null;
		}
	}
}
