package _14_;

public class ReorderTest {
	public static void main(String[] args) {
		int[] a = { 2, 1, 1, 5, 1, 1, 3, 7, 1 };
		int[] aOrdered;
		try {
			aOrdered = Reorder.reorder(a);
			for (int i = 0; i < aOrdered.length; i++) {
				System.out.print(aOrdered[i] + ",");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
