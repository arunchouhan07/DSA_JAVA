public class Solution {
	public static Pair search(int [][] matrix, int x) {
		Pair p=new Pair(-1,-1);
        int row=0;
        int colume=matrix[row].length-1;
        while(row<matrix.length && colume>=0){
            if(matrix[row][colume]==x){
                Pair p1=new Pair(row,colume);
                return p1;
            }
            else if(matrix[row][colume]>x){
                colume--;
            }
            else {
                row++;
            }
        }
        return p;
	}
}
