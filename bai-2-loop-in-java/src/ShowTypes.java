import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for (int i = 1; i < 7; i++) {
                        for (int j = 7; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int z = 1; z < i; z++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for(int i=5;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    for(int i=5;i>=1;i--){
                        for (int z=5;z>=i;z--){
                            System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i < 7; i++) {
                        for (int j = 7; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int z = 1; z < i; z++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
