package _42_2;

public class LeftRotateStringTest {

	public static void main(String[] args) {
		String str = "abcdefg";
		String resultStr;
		E42LeftRotateString.leftRotateString(str, 2);
		try {
			resultStr = LeftRotateString.getLeftRotateString(str, 3);
			System.out.println(resultStr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
