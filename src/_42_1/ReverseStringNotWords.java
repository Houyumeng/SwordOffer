package _42_1;

/*
 * ��תһ�仰�еĵĵ��ʣ�������ת�����е��ַ�*/
public class ReverseStringNotWords {
	public static String getReverseStringNotWords(String str) {
		if (str.length() == 1 || str == null) {
			return str;
		}
		System.out.println(str);
//		���ȷ�ת���仰
		String reversedStr = reverseChar(str, 0, str.length() - 1);
		System.out.println(reversedStr);
		String resultStr = "";
		// String��split()�ָ�
		String[] strArray = reversedStr.split(" ");
		for (String s : strArray) {
			resultStr = resultStr + reverseChar(s, 0, s.length() - 1)+" ";
		}
		return resultStr;
	}

	// ��ת�ַ����в����ַ�����
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
