package chapter2;

public class _2_Singleton4 {
	private _2_Singleton4() {
	}

	private static _2_Singleton4 instance = null;

	public static _2_Singleton4 getSingleton() {
//		ͬ��������ʱ����ʵ������֮����Ҫ��������
		synchronized (_2_Singleton4.class) {

			if (instance == null) {
				instance = new _2_Singleton4();
			}
		}
		return instance;
	}
}
