package _32_;

/*
 * 输入一个数n，输出从1到n数中出现1的次数
 *
 * 按每一位来考虑，
    1)此位大于1，这一位上1的个数有 ([n / 10^(b+1) ] + 1) * 10^b
    2)此位等于0，为 ([n / 10^(b+1) ] ) * 10^b
    3)此位等于1，在0的基础上加上n mod 10^b + 1
    举个例子：
    30143:
    由于3>1,则个位上出现1的次数为(3014+1)*1(30143里面有3014个0~9，而每个0~9里面有1个1，3>1则后续0~3里面也有一个1)
    由于4>1,则十位上出现1的次数为(301+1)*10(30143里面有30143/100个0~99，而每0~99里面有一个10~19，10~19有10个1，43为最后一轮不完整的0~99，故也有一个10~19，最终有(301+1)*10个1)
    由于1=1，则百位上出现1次数为(30+0)*100+(43+1)(30个完整的100~199，最后一轮不完整，还有143-100+1个1)
    由于0<1，则千位上出现1次数为(3+0)*1000(同上)

    注:以百位为例，百位出现1为100~199，*100的意思为单步出现了100~199，100次，
    *30是因为出现了30次100~199,+(43+1)是因为最后一次301**不完整导致。*/
public class CountsOf1 {
	public static long getCountsOf1(long n) {
		if (n <= 0) {
			return 0;
		}
		long counts = 0;// 记录1的个数
		long current;// 当前位
		long remain = 0;
		long base = 1;
		while (n != 0) {
			current = n % 10;
			n = n / 10;
			if (current > 1) {
				counts += (n + 1) * base;
			} else if (current == 1) {
				counts += n * base + remain + 1;
			} else {
				counts += n * base;
			}
			remain += current * base;
			base *= 10;
		}
		return counts;
	}
}
