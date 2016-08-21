package _2_;

public class SingleInstanceTest {

	public static void main(String[] args) {
		Singleton1 instance1 = Singleton1.getInstance();
		Singleton1 instance2 = Singleton1.getInstance();
		System.out.println(instance1.equals(instance2));
		Singleton2 instance5 = Singleton2.getInstance();
		Singleton2 instance6 = Singleton2.getInstance();
		System.out.println(instance5.equals(instance6));
		Singleton3 instance3 = Singleton3.getInstance();
		Singleton3 instance4 = Singleton3.getInstance();
		System.out.println(instance3.equals(instance4));
	}

}
