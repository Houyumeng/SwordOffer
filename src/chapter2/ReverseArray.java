package chapter2;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = new int[] { (int) (Math.random() * 1000), (int) (Math.random() * 1000),
				(int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000) };
		System.out.println("��ת֮ǰ��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}
		swap(array);
		System.out.println();
		System.out.println("��ת֮��");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");

		}

	}

	public static int[] swap(int[] a) {
		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}
}
