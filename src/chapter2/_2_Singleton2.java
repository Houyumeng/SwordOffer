package chapter2;

//推荐解法二：按需创建实例
public class _2_Singleton2 {
	_2_Singleton2() {

	}

	public static _2_Singleton2 getInstance() {
		return Nested.instance;
	}

	private static class Nested {
		private static _2_Singleton2 instance = new _2_Singleton2();
	}
}
