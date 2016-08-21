package _2_;
//推荐解法1
//但会过早创建实例，降低内存使用效率	
public class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 instance = new Singleton1();

	public static Singleton1 getInstance() {
		return instance;
	}
}
