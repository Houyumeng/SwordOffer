package _30_;

/*�������ǰK����С����*/
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
			 * ʵ�ֽ�������
			 * int compare(Object o1, Object o2) ����һ���������͵�����
			 * ���Ҫ������������
			 * ��o1 С��o2������-1������������ȷ���0��o1����02����1�������� 
			 * ���Ҫ���ս�������
			 * ��o1С��o2������1������������ȷ���0��01����02����-1��������
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
		 * ������������������*/
		Queue<Integer> pq = new PriorityQueue<Integer>(array.length, com);
		for (int i = 0; i < array.length; i++) {
			pq.add(array[i]);
		}
		/*
		 * �����м���ǰK��������Ԫ��*/
		for (int i = 0; i < k; i++) {
			list.add(pq.poll());
		}
		return list;
	}
}