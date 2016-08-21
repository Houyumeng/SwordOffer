package _2_;

//多线程时会出现问题，两个线程会同时创建两个对象，就不能保证单例设计
public class Singleton3 {
	private Singleton3() {
	}

	private static Singleton3 instance = null;

	public static Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}
