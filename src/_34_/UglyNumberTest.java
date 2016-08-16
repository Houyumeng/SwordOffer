package _34_;

public class UglyNumberTest {

	public static void main(String[] args) {
		int number;
		try {
			number = UglyNumber.getUglyNumber2(1500);
			System.out.println(number);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
