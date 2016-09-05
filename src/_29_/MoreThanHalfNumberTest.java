package _29_;

public class MoreThanHalfNumberTest {

	public static void main(String[] args) {
		int[] array = { 2, 3, 2, 4, 2, 6, 1, 2 };
		try {
			int result = MoreThanHalfNumber.moreThanHalfNumber_Solution2(array);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
