package _43_;

import java.util.Arrays;

/*从扑克中抽出5张，判断是否是顺子，王可以替代任何牌*/
public class Iscontinues {
	public static boolean isContinues(int[] array) {
		if (array == null) {
			return false;
		}
		Arrays.sort(array);
		int countsOf0 = 0;
		for (int i = 0; i < array.length && array[i] == 0; i++) {
			countsOf0++;
		}
		int small = countsOf0;
		int big = small + 1;
		int numbersOfGaps = 0;
		while (big < array.length) {
			numbersOfGaps += array[big] - array[small] - 1;
			small = big;
			big++;
		}
		return numbersOfGaps > countsOf0 ? false : true;
	}
}
