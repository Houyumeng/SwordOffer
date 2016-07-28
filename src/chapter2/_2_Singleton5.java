package chapter2;
//可行解法
public class _2_Singleton5 {
	private _2_Singleton5() {
	}

	private static _2_Singleton5 instance = null;

	public static _2_Singleton5 getSingleton() {
//		同步代码块耗时，在实例创建之后不需要加锁操作
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
