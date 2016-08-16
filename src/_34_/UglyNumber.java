package _34_;

public class UglyNumber {
	// 方法2
	public static int getUglyNumber2(int index) throws Exception{
		if (index <= 0) {
			throw new Exception("invalid input");
		}
		int[] uglyArray = new int[index];
		uglyArray[0] = 1;
		int nextIndex = 1;
		int p2 = 0;
		int p3 = 0;
		int p5 = 0;
		while (nextIndex < index) {
			int min = min(uglyArray[p2] * 2, uglyArray[p3] * 3, uglyArray[p5] * 5);
			uglyArray[nextIndex] = min;
			while (uglyArray[p2] * 2 <= uglyArray[nextIndex]) {
				p2++;
			}
			while (uglyArray[p3] * 3 <= uglyArray[nextIndex]) {
				p3++;
			}
			while (uglyArray[p5] * 5 <= uglyArray[nextIndex]) {
				p5++;
			}
			nextIndex++;
		}
		return uglyArray[nextIndex-1];
	}

	public static int min(int m, int n, int l) {
		int min = (m < n) ? m : n;
		return (min < l) ? min : l;
	}

	// 方法1.太慢
	public static int getUglyNumber1(int index) {
		int number = 0;
		int UgelyNumFound = 0;
		while (UgelyNumFound < index) {
			number++;
			if (isUglyNumber1(number)) {
				UgelyNumFound++;
			}
		}
		return number;
	}

	public static boolean isUglyNumber1(int number) {
		while (number % 2 == 0) {
			number /= 2;
		}
		while (number % 3 == 0) {
			number /= 3;
		}
		while (number % 5 == 0) {
			number /= 5;
		}
		return (number == 1) ? true : false;
	}
}
