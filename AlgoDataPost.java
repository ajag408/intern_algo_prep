import java.util.*;

class Program {
	static int count = 1;

  public static List<Integer> riverSizes(int[][] matrix) {
    List<Integer> riverSizes = new ArrayList<Integer>();
		int currX, currY = 0;
		for(int i = 0; i<matrix.length; i++){
			currX = i;
			for(int j = 0; j<matrix[i].length; j++){
				currY = j;
				if(matrix[i][j] == 1){
					flow(matrix, currX, currY);
					riverSizes.add(count-1);
					count = 1;
				}
			}
		}
    return riverSizes;
  }

	public static void flow(int[][] matrix, int currX, int currY){
		if(matrix[currX][currY] == 0){
			return;
		}
		count++;
		matrix[currX][currY] = 0;
		if(currX+1<matrix.length){
			flow(matrix, currX+1,currY);
		}
		if(currY+1<matrix[currX].length){
			flow(matrix, currX,currY+1);
		}
		if(currX-1>=0){
			flow(matrix, currX-1,currY);
		}
		if(currY-1>=0){
			flow(matrix, currX,currY-1);
		}
		return;
	}
}
