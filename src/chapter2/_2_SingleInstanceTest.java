package chapter2;

public class _2_SingleInstanceTest {

	public static void main(String[] args) {
		_2_Singleton1 instance1 = _2_Singleton1.getInstance();
		_2_Singleton1 instance2 = _2_Singleton1.getInstance();
		System.out.println(instance1.equals(instance2));
		_2_Singleton2 instance5 = _2_Singleton2.getInstance();
		_2_Singleton2 instance6 = _2_Singleton2.getInstance();
		System.out.println(instance5.equals(instance6));
		_2_Singleton3 instance3 = _2_Singleton3.getInstance();
		_2_Singleton3 instance4 = _2_Singleton3.getInstance();
		System.out.println(instance3.equals(instance4));
	}

}
