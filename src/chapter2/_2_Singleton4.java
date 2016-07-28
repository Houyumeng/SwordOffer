package chapter2;

public class _2_Singleton4 {
	private _2_Singleton4() {
	}

	private static _2_Singleton4 instance = null;

	public static _2_Singleton4 getSingleton() {
//		同步代码块耗时，在实例创建之后不需要加锁操作
		synchronized (_2_Singleton4.class) {

			if (instance == null) {
				instance = new _2_Singleton4();
			}
		}
		return instance;
	}
}
