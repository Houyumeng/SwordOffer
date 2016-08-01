package _20_;

public class Print {
	public static void printMatrixColockWisely(int[][] array, int rows, int columns) throws Exception {
		if (array == null || columns <= 0 || rows <= 0) {
			throw new Exception("�����쳣");
		}
		// �ж��Ƿ�������Ǿ���
		for (int i = 0; i < array.length; i++) {
			if (array[i].length != columns || array.length != rows) {
				throw new Exception("�����쳣!");
			}
		}
		int start = 0;
		while (start * 2 < columns && start * 2 < rows) {
			printMatrix(array, columns, rows, start++);
		}
	}

	public static void printMatrix(int[][] array, int columns, int rows, int start) {
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;
		// ��ӡ��һ��:������
		for (int i = start; i <= endX; i++) {
			System.out.print(array[start][i] + " ");
		}
		// ��ӡ�ڶ��������ϵ���
		if (endY > start) {
			for (int i = start + 1; i <= endY; i++) {
				System.out.print(array[i][endX] + " ");
			}
		}
		// ��ӡ�����������ҵ���
		if (endX > start && endY > start) {
			for (int i = endX - 1; i >= start; i--) {
				System.out.print(array[endY][i] + " ");
			}
		}
		// ��ӡ���Ĳ������µ���
		if (endY > start + 1 && endX > start) {
			for (int i = endY - 1; i > start; i--) {
				System.out.print(array[i][start] + " ");
			}
		}

	}
}
