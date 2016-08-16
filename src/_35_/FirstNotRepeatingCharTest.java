package _35_;

public class FirstNotRepeatingCharTest {

	public static void main(String[] args) {
		String str = "abadeb";
		try {
			Character c = FirstNotRepeatingChar.getFirstNotRepeatingChar(str);
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
