import java.util.Random;

public class MatrixOperations {

    
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers from 0 to 9
            }
        }
        return matrix;
    }

    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];

        return result;
    }

    
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];

        return result;
    }

    
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int sumLength = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < sumLength; k++)
                    result[i][j] += A[i][k] * B[k][j];

        return result;
    }

    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];

        return transposed;
    }

    
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    public static void main(String[] args) {
        
        int[][] A = generateMatrix(2, 2);
        int[][] B = generateMatrix(2, 2);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("A + B:");
        printMatrix(addMatrices(A, B));

        System.out.println("A - B:");
        printMatrix(subtractMatrices(A, B));

        System.out.println("A * B:");
        printMatrix(multiplyMatrices(A, B));

        System.out.println("Transpose of A:");
        printMatrix(transposeMatrix(A));

        System.out.println("Determinant of A:");
        System.out.println(determinant2x2(A));
    }
}
