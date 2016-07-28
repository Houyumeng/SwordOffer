package chapter2;
//推荐解法1
//但会过早创建实例，降低内存使用效率	
public class _2_Singleton1 {
	private _2_Singleton1() {
	}

	private static _2_Singleton1 instance = new _2_Singleton1();

	public static _2_Singleton1 getInstance() {
		return instance;
	}
}
