package _41_2;

//��������֮�͵���һ����
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
		// ���������������������
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
