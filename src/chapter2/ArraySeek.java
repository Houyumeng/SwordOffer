package chapter2;

public class ArraySeek {
	public static boolean find(int[][] array,int target){
		int row = array.length-1;
		int col=0;
		while(row>=0&&col<=array[row].length-1){
			if(target>array[row][col]){
				col++;
			}else if(target<array[row][col]){
				row--;
			}else{
				return true;
			}
		}
		return false;
	}
}
