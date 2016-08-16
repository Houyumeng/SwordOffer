package _49_;

/*
 * 将字符串转换为整数*/
public class StringToInt {
	public static int atoi(String str) throws Exception {
		str = str.trim();
		int i = 0;
		boolean minus = false;
		// 判断正负号
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// 判断是否越界
		int num = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num *= 10;
				num += str.charAt(i) - '0';
			} else {
				throw new Exception("invalid input");
			}
		}
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		if (minus && num < min) {
			return min;
		}
		if (!minus && num > max) {
			return max;
		}
		return minus ? (0 - num) : num;
	}
}
