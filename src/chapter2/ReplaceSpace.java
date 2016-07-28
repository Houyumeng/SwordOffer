package chapter2;

public class ReplaceSpace {
	public static String replace(String str) {
		StringBuffer sb = new StringBuffer();
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]==' '){
				sb.append("%20");
			}else{
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}
}
