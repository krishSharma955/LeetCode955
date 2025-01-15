package LeetCode;

public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][]) {
        String s = "";
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
            for(int j = startCol; j<=endCol; j++) {
                s += matrix[startRow][j];
            }
            for(int i = startRow+1; i<=endRow; i++) {
                s += matrix[i][endCol];
            }
            for(int j = endCol-1; j>=startCol; j--) {
                s += matrix[endRow][j];
            }
            for(int i = endRow-1; i>=startRow+1; i--) {
                s += matrix[i][startCol];
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        spiralMatrix(matrix);
    }
}
