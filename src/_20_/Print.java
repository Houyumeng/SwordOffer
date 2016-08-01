package _20_;

public class Print {
	public static void printMatrixColockWisely(int[][] array, int rows, int columns) throws Exception {
		if (array == null || columns <= 0 || rows <= 0) {
			throw new Exception("输入异常");
		}
		// 判断是否输入的是矩阵
		for (int i = 0; i < array.length; i++) {
			if (array[i].length != columns || array.length != rows) {
				throw new Exception("输入异常!");
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
		// 打印第一步:从左到右
		for (int i = start; i <= endX; i++) {
			System.out.print(array[start][i] + " ");
		}
		// 打印第二步：从上到下
		if (endY > start) {
			for (int i = start + 1; i <= endY; i++) {
				System.out.print(array[i][endX] + " ");
			}
		}
		// 打印第三步：从右到左
		if (endX > start && endY > start) {
			for (int i = endX - 1; i >= start; i--) {
				System.out.print(array[endY][i] + " ");
			}
		}
		// 打印第四步：从下到上
		if (endY > start + 1 && endX > start) {
			for (int i = endY - 1; i > start; i--) {
				System.out.print(array[i][start] + " ");
			}
		}

	}
}
