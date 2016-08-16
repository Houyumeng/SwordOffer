package _49_;

/*
 * ���ַ���ת��Ϊ����*/
public class StringToInt {
	public static int atoi(String str) throws Exception {
		str = str.trim();
		int i = 0;
		boolean minus = false;
		// �ж�������
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// �ж��Ƿ�Խ��
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
