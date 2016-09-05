package _40_;

//一个数组中只有两个数是不同的，其他数字都是成对出现的，输出这两个数
public class NumbersAppearsOnce {
	public static String getNumbersAppearsOnce(int[] array, int length) throws Exception {
		if (array == null || length < 0) {
			throw new Exception("invalid input");
		}
		int result = 0;
		for (int i = 0; i < length; i++) {
			result ^= array[i];
		}
		int indexOf1 = getIndexOf1(result);
		int m = 0;
		int n = 0;
		for (int j = 0; j < length; j++) {
			if (is1Or0(array[j], indexOf1) == 1) {
				m ^= array[j]; //array[j]^0==array[j]
			} else {
				n ^= array[j];
			}
		}
		return "two numbers are :" + m + "," + n;
	}

	// 获得异或结果中1出现的位数
	public static int getIndexOf1(int num) {
		int indexOf1 = 0;
		while ((num & 1) == 0 && indexOf1 < 32) {
			num = num >> 1;
			indexOf1++;
		}
		return indexOf1;
	}

	// 判断数组数字中index位是1还是0
	public static int is1Or0(int num, int indexOf1) {
		num = num >> indexOf1;
		return (num & 1);
	}
}
