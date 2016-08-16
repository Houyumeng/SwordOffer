package _38_;

public class NumberInOrderedListTest {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 3, 4, 5 };
		try {
			int counts = NumberInOrderedList.getCountsOfK(array, 3, 0, array.length-1);
			System.out.println(counts);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
