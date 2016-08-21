package _36_;

public class InversePairTest {

	public static void main(String[] args) {
		int[] array = { 5, 7, 6, 4, 6, 7, 1, 0, 3, 8, 4, 6, 2 };
		try {
			System.out.println(InversePairs.getInversePairs(array));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
