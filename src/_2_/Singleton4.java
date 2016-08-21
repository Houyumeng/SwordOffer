package _2_;

public class Singleton4 {
	private Singleton4() {
	}

	private static Singleton4 instance = null;

	public static Singleton4 getSingleton() {
//		同步代码块耗时
		synchronized (Singleton4.class) {

			if (instance == null) {
				instance = new Singleton4();
			}
		}
		return instance;
	}
}
