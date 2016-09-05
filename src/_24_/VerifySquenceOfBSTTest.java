package _24_;

public class VerifySquenceOfBSTTest {

	public static void main(String[] args) {
		int[] a = { 7,0};
		try {
			boolean b = VerifySquenceOfBST.isVerifySquenceofBST(a, 0, a.length - 1);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
