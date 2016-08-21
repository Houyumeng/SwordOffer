package _33_;

public class PrintMinNumberTest {

	public static void main(String[] args) {
		int[] array = { 3, 32, 321 };
		try {
			PrintMinNumber.printMinNumber(array);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
