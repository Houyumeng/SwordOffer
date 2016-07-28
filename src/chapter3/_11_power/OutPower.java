package chapter3._11_power;

//数值的整数次方
public class OutPower {
	// 方法二：求n次方公式
	public static double power1(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (base == 1) {
			return base;
		}
		// exponent>>1比exponent/2快
		double result = power1(base, exponent >> 1);
		result *= result;
		// exponent&0X1为取余
		if ((exponent & 0X1) == 1) {
			result = result * base;
		}
		return result;
	}

	// 方法一：
	public static double power(double base, int exponent) throws Exception {
		double result = 1;
		if (Math.abs(base - 0.0) < 1e-6 && exponent < 0) {
			throw new Exception("输入错误！");
		}
		if (exponent >= 0) {
			for (int i = 0; i < exponent; i++) {
				result = result * base;
			}
			return result;
		} else {
			// 若exponent为负数，则递归调用power
			return 1 / power(base, -exponent);
		}
	}
}
// 判断浮点数是否相等
// double a=1.0;
// double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
// System.out.println(a==b);//false
// System.out.println(Math.abs(a-b)<1e-6);//true