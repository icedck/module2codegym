import java.util.Scanner;

public class FindElementTwoDimensionalArray {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,99,11},
//                {100,2,3,101}
//        };
//        int max = arr[0][0];
//        for(int i = 1; i < arr.length; i++) {
//            for(int j = 0; j < arr[i].length; j++) {
//                if(arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);
        int row, col;
        int[][] arr;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the row number: ");
            row = sc.nextInt();
            System.out.print("Enter the column number: ");
            col = sc.nextInt();
            if (row > 20 || col > 20|| row < 0 || col < 0){
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
        int max = max2DArray(arr);
        System.out.print("Maximum element is " + max);
    }
    public static int max2DArray(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
