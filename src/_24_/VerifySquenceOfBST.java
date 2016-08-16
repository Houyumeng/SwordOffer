package _24_;

/*
 * �ж������Ƿ�Ϊ�����������ĺ����������*/
public class VerifySquenceOfBST {
	public static boolean verifySquenceofBST(int[] a, int start, int end) throws Exception {
		if (a == null|| a.length < 2) {
			return true;
		}
		if (start < 0 || end > a.length - 1) {
			throw new Exception("����");
		}
		int root = a[end];
		// �жϸ�����������
		int i = start;
		for (; i < end; i++) {
			if (a[i] > root) {
				break;
			}
		}
		// �жϸ�����������
		int j = i;
		for (; j < end; j++) {
			if (a[j] < root) {
				return false;
			}
		}
		// �ж��������Ƿ�Ϊ����������
		boolean left = true;
		if (i > start) {/* �ж��Ƿ���������� */
			left = verifySquenceofBST(a, start, i - 1);
		}
		// �ж��������Ƿ�Ϊ����������
		boolean right = true;
		if (i < end) {/* �ж��Ƿ���������� */
			right = verifySquenceofBST(a, i, end-1);
		}
		return (left && right);
	}
}
