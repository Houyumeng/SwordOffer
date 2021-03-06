package _28_;

/*输入字符串，输出字符串中字符的所有排列*/
public class StringSort {
	public static void permutation(char[] str) {
		if (str == null) {
			return;
		}

		permutation(str, 0);
	}

	private static void permutation(char[] str, int begin) {

		// 边界条件
		if (begin == str.length) {
			System.out.println(str);
		}

		else {
			for (int i = begin; i < str.length; i++) {
				char temp = str[begin];
				str[begin] = str[i];
				str[i] = temp;

				permutation(str, begin + 1);
				// 交换完还得交换回来才能str[begin]不变
				temp = str[begin];
				str[begin] = str[i];
				str[i] = temp;

			}
		}
	}
}
