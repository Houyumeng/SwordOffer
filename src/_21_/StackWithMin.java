package _21_;

/*定义栈数据结构，实现能够找到栈的最小元素的min()  并且调用时间复杂度为O(1)*/
import java.util.Stack;

public class StackWithMin<T extends Comparable<? super T>> {
	// 数据栈，存储数据
	Stack<T> sData = new Stack<>();
	// 辅助栈，存储最小值
	Stack<T> sMin = new Stack<>();

	public void pushNew(T element) {

		sData.push(element);
		// sMin为空或者添加元素比sMin栈顶元素小
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
			throw new Exception("空栈不能弹出元素！");
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
