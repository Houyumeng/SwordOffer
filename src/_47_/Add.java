package _47_;

/*
 * ���üӼ��˳����ӷ�*/
public class Add {
	public static int add(int n, int m) {
		int sum = 0;
		// carryΪ��λ
		int carry = 0;
		do {
			// ������򣬲��ƽ�λ
			sum = n ^ m;
			// �������㲢����һλ
			carry = n & m;
			n = sum;
			m = carry << 1;
		} while (carry != 0);
		return sum;
	}
}
