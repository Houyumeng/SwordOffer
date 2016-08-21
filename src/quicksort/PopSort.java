package quicksort;

/*ц╟ещеепР*/
public class PopSort {
	public static void main(String[] args) {
		int[] array = { 2, 9, 5, 7, 6, 1, 8 };
		int[] result;
		try {
			result = getPopOrder(array);
			for (int i = 0; i < array.length; i++) {
				System.out.print(result[i]+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[] getPopOrder(int[] array) throws Exception {
		if (array == null || array.length < 0) {
			throw new Exception("invalid input");
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
