package _41_2;

//连续数列之和等于一个数
public class ContinueSequenceWithSum {
	public static void getContinueSequence(int s) {
		if (s < 3) {
			return;
		}
		int small = 1;
		int big = 2;
		int middle = (1 + s) / 2;
		int sum = small + big;
		boolean b = false;
		while (small < middle) {
			if (sum == s) {
				printContinueSequence(small, big);
				b = true;
			}
			while (sum > s && small < middle) {
				sum -= small;
				small++;
				if (sum == s) {
					printContinueSequence(small, big);
					b = true;
				}
			}
			big++;
			sum += big;
		}
		// 不存在这样的序列则输出
		if (!b) {
			System.out.println("not exsit consequence");
		}
	}

	public static void printContinueSequence(int small, int big) {
		System.out.print("output sequence: ");
		for (int i = small; i <= big; i++) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
