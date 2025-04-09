import java.util.Scanner;

public class SumCol2DArray {
    public static void main(String[] args) {
        int row, col, indexcol;
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the row number: ");
            row = sc.nextInt();
            System.out.print("Enter the col number: ");
            col = sc.nextInt();
            if (row > 20 || col > 20 || row < 0 || col < 0){
                System.out.println("Row and column numbers must be between 20 and 20");
            }
        }while (row > 20 || col > 20|| row < 0 || col < 0);
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter element arr[%d][%d]: ", i + 1, j + 1);
                arr[i][j] = sc.nextInt();
            }
        }
        do {
            System.out.print("Enter col sum : ");
            indexcol = sc.nextInt();
            if (indexcol >col || indexcol < 0){
                System.out.println("Column number must be between 0 and col");
            }
        }while (indexcol < 0 || indexcol > col);

        int sum1col = sumCol(arr, indexcol);
        System.out.printf("Sum of column %d is %d ", indexcol + 1, sum1col);
        System.out.println();
        int mainDiagonalSum = mainDiagonal(arr);
        System.out.printf("Diagonal sum is %d ", mainDiagonalSum);
        System.out.println();
        int secondaryDiagonalSum = secondaryDiagonal(arr);
        System.out.printf("Secondary diagonal sum is %d ", secondaryDiagonalSum);
    }

    // tính tổng 1 cột
    public static int sumCol(int[][] arr, int indexcol) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][indexcol];
        }
        return sum;
    }

    // tính tổng đường chéo chính
    public static int mainDiagonal(int[][] arr){
        int diagonal = 0;
        for (int i = 0; i < arr.length; i++) {
            diagonal += arr[i][i];
        }
        return diagonal;
    }


    //tính tổng đường chéo thứ 2
    public static int secondaryDiagonal(int[][] arr){
        int diagonal = 0;
        for (int i = 0; i <arr.length; i++) {
                diagonal += arr[i][arr[i].length - 1 - i];
        }
        return diagonal;
    }
}
