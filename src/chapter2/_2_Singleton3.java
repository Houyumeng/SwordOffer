package chapter2;
//多线程时会出现问题，两个线程会同时创建两个对象，就不能保证单例设计
public class _2_Singleton3 {
	private _2_Singleton3() {
	}

	private static _2_Singleton3 instance = null;

	public static _2_Singleton3 getInstance() {
		if (instance == null) {
			instance = new _2_Singleton3();
		}
		return instance;
	}
}
