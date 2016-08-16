package _30_;

/*输出数组前K个最小的数*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
	public static List<Integer> GetLeastNumbers_Solution(int[] array, int k) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		if (array == null || k <= 0 || k > array.length) {
			throw new Exception("invalid input");
		}
		Comparator<Integer> com = new Comparator<Integer>() {
			/*
			 * 实现降序排列
			 * int compare(Object o1, Object o2) 返回一个基本类型的整型
			 * 如果要按照升序排序
			 * 则o1 小于o2，返回-1（负数），相等返回0，o1大于02返回1（正数） 
			 * 如果要按照降序排序
			 * 则o1小于o2，返回1（正数），相等返回0，01大于02返回-1（负数）
			 */
			public int compare(Integer a, Integer b) {
				if (a > b) {
					return 1;
				} else if (a == b)
					return 0;
				else
					return -1;
			}
		};
		/*
		 * 将数组升序加入队列中*/
		Queue<Integer> pq = new PriorityQueue<Integer>(array.length, com);
		for (int i = 0; i < array.length; i++) {
			pq.add(array[i]);
		}
		/*
		 * 集合中加入前K个出队列元素*/
		for (int i = 0; i < k; i++) {
			list.add(pq.poll());
		}
		return list;
	}
}