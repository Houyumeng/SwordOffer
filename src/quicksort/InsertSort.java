package quicksort;

/*≤Â»Î≈≈–Ú*/
public class InsertSort {
	public static void main(String[] args) {
		int[] array = {5,3,9,7,1,5,6,4};
		int[] result;
		try {
			result = getInsertSort(array);
			for (int i : result) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int[] getInsertSort(int[] array) throws Exception {
		if (array == null || array.length <= 0) {
			throw new Exception("error:invalid input");
		}
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int position = i;
			for (int j = i - 1; j >= 0 && array[j] > current; j--) {
				array[j+1] = array[j];
				array[j] = current;
				position--;
			}
			array[position] = current;
		}
		return array;
	}
}
