import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Given a equation as 'ax + b = 0', please enter constants: \n");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        if (a != 0){
            double result = -b / a;
            System.out.println("result = " + result);
        }else{
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
