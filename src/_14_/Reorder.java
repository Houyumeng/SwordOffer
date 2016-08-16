package _14_;

//���������ǰ�벿��ȫΪ��������벿��Ϊż��
public class Reorder {
	public static int[] reorder(int[] a) throws Exception{
		if(a.length==0){
			throw new Exception(" invalid input!");
		}
		int i = 0;
		int j = a.length - 1;
		for (;;) {
			while (a[i] % 2 != 0) {
				i++;
			}
			while (a[j] % 2 == 0) {
				j--;
			}
			if (i < j) {
				swap(a, i, j);
			} else
				break;
		}
		return a;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
