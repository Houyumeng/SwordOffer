package _33_;

public class PrintMinNumberTest {

	public static void main(String[] args) {
		int[] array = {32,321,3};
		try {
			PrintMinNumber.printMinNumber(array);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
