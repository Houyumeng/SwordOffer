package chapter2;
//���нⷨ
public class _2_Singleton5 {
	private _2_Singleton5() {
	}

	private static _2_Singleton5 instance = null;

	public static _2_Singleton5 getSingleton() {
//		ͬ��������ʱ����ʵ������֮����Ҫ��������
		if(instance==null){
			
		synchronized (_2_Singleton5.class) {

			if (instance == null) {
				instance = new _2_Singleton5();
			}
		}
		}
		return instance;
	}
}
