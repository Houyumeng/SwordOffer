package _49_;

public class StringToIntTest {

	public static void main(String[] args) {
		String str = " +1236 ";
		int result;
		try {
			result = StringToInt.atoi(str);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
