package _29_;

public class MoreThanHalfNumberTest {

	public static void main(String[] args) {
		int[] array = { 2, 3, 2, 4, 2, 6, 2, 1 };
		try {
			int result = MoreThanHalfNumber.moreThanHalfNumber_Solution(array);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
