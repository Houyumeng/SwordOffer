package _2_;

//�Ƽ��ⷨ�������贴��ʵ��
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
