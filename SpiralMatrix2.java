package LeetCode;

//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

public class SpiralMatrix2 {
    public static int[][] spiralMatrix2(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        int addval = 1;
        while(startRow<=endRow && startCol<=endCol) {
            for(int j = startCol; j<=endCol; j++) {
                matrix[startRow][j] = addval;
                addval++;
            }
            for(int i = startRow+1; i<=endRow; i++) {
                matrix[i][endCol] = addval;
                addval++;
            }
            for(int j = endCol-1; j>=startCol; j--) {
                matrix[endRow][j] = addval;
                addval++;
            }
            for(int i = endRow-1; i>=startRow+1; i--) {
                matrix[i][startCol] = addval;
                addval++;
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        printMatrix(matrix);
        return matrix;
    }
    public static void printMatrix(int matrix[][]) {
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        spiralMatrix2(3);
    }
}
