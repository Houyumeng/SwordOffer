package _24_;

public class VerifySquenceOfBSTTest {

	public static void main(String[] args) {
		int[] a = {5,7,6,9,11,10,8};
		try {
			boolean b = VerifySquenceOfBST.verifySquenceofBST(a, 0, a.length -1);
			System.out.println(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
