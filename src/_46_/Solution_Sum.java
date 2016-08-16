package _46_;

/*
 * 求1+2+3+…+n，
 * 要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 高斯求和公式（1+n）*n/2*/
public class Solution_Sum {
	public static int getSum(int n) {
		int result = (int) (n + Math.pow(n, 2));
		return result >> 1;
	}
}
