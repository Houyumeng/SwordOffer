package _2_;
//�Ƽ��ⷨ1
//������紴��ʵ���������ڴ�ʹ��Ч��	
public class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 instance = new Singleton1();

	public static Singleton1 getInstance() {
		return instance;
	}
}
