package chapter2;
//���߳�ʱ��������⣬�����̻߳�ͬʱ�����������󣬾Ͳ��ܱ�֤�������
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
