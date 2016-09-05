package _11_power;

public class OutPowerTest {

	public static void main(String[] args) {
		double result= 0;
		 try {
		 result = OutPower.power(0, 0);
		 System.out.println(result);
		 } catch (Exception e) {
		 System.out.println(e.getMessage());
		 }
//		result=OutPower.power(2, -2);
//		System.out.println(result);
	}

}
