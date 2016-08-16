package _24_;

/*
 * 判断数列是否为二叉搜索树的后序遍历序列*/
public class VerifySquenceOfBST {
	public static boolean verifySquenceofBST(int[] a, int start, int end) throws Exception {
		if (a == null|| a.length < 2) {
			return true;
		}
		if (start < 0 || end > a.length - 1) {
			throw new Exception("有误！");
		}
		int root = a[end];
		// 判断根结点的左子树
		int i = start;
		for (; i < end; i++) {
			if (a[i] > root) {
				break;
			}
		}
		// 判断根结点的右子树
		int j = i;
		for (; j < end; j++) {
			if (a[j] < root) {
				return false;
			}
		}
		// 判断左子树是否为二叉搜索树
		boolean left = true;
		if (i > start) {/* 判断是否存在左子树 */
			left = verifySquenceofBST(a, start, i - 1);
		}
		// 判断右子树是否为二叉搜索树
		boolean right = true;
		if (i < end) {/* 判断是否存在右子树 */
			right = verifySquenceofBST(a, i, end-1);
		}
		return (left && right);
	}
}
