package chapter2;
//�Ƽ��ⷨ1
//������紴��ʵ���������ڴ�ʹ��Ч��	
public class _2_Singleton1 {
	private _2_Singleton1() {
	}

	private static _2_Singleton1 instance = new _2_Singleton1();

	public static _2_Singleton1 getInstance() {
		return instance;
	}
}
