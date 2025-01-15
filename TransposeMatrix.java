package LeetCode;
import java.util.*;

public class TransposeMatrix {
    public static int[][] transpose(int matrix[][]) {
        int tmatrix[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(tmatrix);
        return tmatrix;
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
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        transpose(matrix);
        sc.close();
        
    }
}
