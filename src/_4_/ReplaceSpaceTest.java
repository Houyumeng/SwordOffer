package _4_;

public class ReplaceSpaceTest {

	public static void main(String[] args) {
		String str = "  I am a man!";
		String strReplaced = ReplaceSpace.replace(str);
		System.out.println(strReplaced);
		// String��repalceAll����
		String Replacedstr = str.replaceAll(" ", "%20");
		System.out.println(Replacedstr);
	}

}
