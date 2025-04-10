import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a: ");
            a = sc.nextDouble();
            System.out.print("Enter b: ");
            b = sc.nextDouble();
            System.out.print("Enter c: ");
            c = sc.nextDouble();
            if (a == 0) {
                System.out.println("Enter a again");
            }
        }while (a == 0);
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        System.out.println("Delta is: " + qe.getDiscriminant());
        int check = qe.checkDelta();
        if (check > 0) {
            System.out.println("The equation has two distinct solutions: " + qe.getRoot1() + ", " + qe.getRoot2());
        }else if (check == 0) {
            System.out.println("The equation has a double solution: " + qe.getRoot3());
        }else{
            System.out.println("equation with no solution");
        }
    }
}