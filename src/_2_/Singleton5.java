package _2_;

//���нⷨ
public class Singleton5 {
	private Singleton5() {
	}

	private static Singleton5 instance = null;

	public static Singleton5 getSingleton() {
		// ͬ��������ʱ����ʵ������֮����Ҫ��������
		if (instance == null) {

			synchronized (Singleton5.class) {

				if (instance == null) {
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
