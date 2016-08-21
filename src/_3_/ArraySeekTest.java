package _3_;

public class ArraySeekTest {

	public static void main(String[] args) {
		int[][] array = new int[3][];
		array[0]=new int[]{1,2};
		array[1]=new int[]{3,8,10};
		array[2]=new int[]{4,9,11,13};
		boolean b = ArraySeek.find(array, 15);
		System.out.println(b);
	}

}
