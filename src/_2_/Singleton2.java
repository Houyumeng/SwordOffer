package _2_;

//推荐解法二：按需创建实例
public class Singleton2 {
	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		return Nested.instance;
	}

	private static class Nested {

		private static Singleton2 instance = new Singleton2();
	}
}
