package _30_;

import java.util.List;

public class SolutionTest {
	public static void main(String[] args) {
		int[] input = { 1, 3, 8, 6, 2, 4, 5 };
		List<Integer> list;
		try {
			list = Solution.GetLeastNumbers_Solution(input, 13);
			for (int i : list) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
