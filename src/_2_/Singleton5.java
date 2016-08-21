package _2_;

//可行解法
public class Singleton5 {
	private Singleton5() {
	}

	private static Singleton5 instance = null;

	public static Singleton5 getSingleton() {
		// 同步代码块耗时，在实例创建之后不需要加锁操作
		if (instance == null) {

			synchronized (Singleton5.class) {

				if (instance == null) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
