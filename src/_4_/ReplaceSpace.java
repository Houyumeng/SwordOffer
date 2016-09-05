package _4_;

public class ReplaceSpace {
	public static String replace(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' '){
				sb.append("%20");
			}else{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}
