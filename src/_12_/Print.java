package _12_;

//��������(δ���)
public class Print {
	public static void pint1ToMaxOfNDigits_2(long n) {

	}

	public static void pint1ToMaxOfNDigits_1(long n) {
		System.out.println("result is:");
		for (long l = 1; l < Math.pow(10, n); l++) {
			System.out.print(l + ",");
		}
	}
}
