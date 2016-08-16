package _28_;

/*�����ַ���������ַ������ַ�����������*/
public class StringSort {
	public static void permutation(char[] str) {
		if (str == null) {
			return;
		}

		permutation(str, 0);
	}

	private static void permutation(char[] str, int begin) {

		if (begin == str.length) {
			System.out.println(str);
		}

		else {
			for (int i = begin; i < str.length; i++) {
				char temp = str[begin];
				str[begin] = str[i];
				str[i] = temp;

				permutation(str, begin + 1);

				temp = str[begin];
				str[begin] = str[i];
				str[i] = temp;

			}
		}
	}
}
