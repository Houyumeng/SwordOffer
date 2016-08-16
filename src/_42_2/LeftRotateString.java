package _42_2;

public class LeftRotateString {
	public static String getLeftRotateString(String str, int n) throws Exception {
		if (str == null || n < 0 || n > str.length()) {
			throw new Exception("invalid input");
		}
		String subStr1 = str.substring(0, n);
		String subStr2 = str.substring(n, str.length());
		return subStr2 + subStr1;
	}
}
