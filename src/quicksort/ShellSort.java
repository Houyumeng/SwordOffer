package quicksort;

/*希尔排序
 * 是插入排序的改进*/
public class ShellSort {
	public static void main(String[] args) {
		int[] array = { 5, 3, 9, 7, 1, 5, 6, 4 };
		shellSort(array);
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	public static int[] shellSort(int[] array) {
		int h = 1;
		// 计算最大h
		while (h <= array.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < array.length; i += h) {
				int current = array[i];
				int position = i;
				for (int j = i - h; j >= 0 && array[j] > current; j--) {
					array[j + h] = array[j];
					position -= h;
				}
				array[position] = current;
			}
			h = (h - 1) / 3;
		}
		return array;
	}
}
