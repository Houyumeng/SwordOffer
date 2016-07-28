package chapter3._11_power;

//��ֵ�������η�
public class OutPower {
	// ����������n�η���ʽ
	public static double power1(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (base == 1) {
			return base;
		}
		// exponent>>1��exponent/2��
		double result = power1(base, exponent >> 1);
		result *= result;
		// exponent&0X1Ϊȡ��
		if ((exponent & 0X1) == 1) {
			result = result * base;
		}
		return result;
	}

	// ����һ��
	public static double power(double base, int exponent) throws Exception {
		double result = 1;
		if (Math.abs(base - 0.0) < 1e-6 && exponent < 0) {
			throw new Exception("�������");
		}
		if (exponent >= 0) {
			for (int i = 0; i < exponent; i++) {
				result = result * base;
			}
			return result;
		} else {
			// ��exponentΪ��������ݹ����power
			return 1 / power(base, -exponent);
		}
	}
}
// �жϸ������Ƿ����
// double a=1.0;
// double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
// System.out.println(a==b);//false
// System.out.println(Math.abs(a-b)<1e-6);//true