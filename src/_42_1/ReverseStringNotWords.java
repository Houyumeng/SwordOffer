package _42_1;

/*
 * 翻转一句话中的的单词，但不翻转单词中的字符*/
public class ReverseStringNotWords {
	public static String getReverseStringNotWords(String str) {
		if (str.length() == 1 || str == null) {
			return str;
		}
		System.out.println(str);
//		首先翻转整句话
		String reversedStr = reverseChar(str, 0, str.length() - 1);
		System.out.println(reversedStr);
		String resultStr = "";
		// String的split()分割
		String[] strArray = reversedStr.split(" ");
		for (String s : strArray) {
			resultStr = resultStr + reverseChar(s, 0, s.length() - 1)+" ";
		}
		return resultStr;
	}

	// 翻转字符串中部分字符操作
	public static String reverseChar(String str, int start, int end) {
		char[] ch = str.toCharArray();
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		return new String(ch);
	}
}
