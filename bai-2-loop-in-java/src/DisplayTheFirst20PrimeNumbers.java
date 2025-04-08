import java.util.Scanner;

public class DisplayTheFirst20PrimeNumbers {
    public static void main(String[] args) {
        int number = 20;
        int count = 0;
        int checkSNT = 0;

        for (int i = 2; i <= number; i++) {
            if (checkSNT < number) {
                for (int j = 1; j <= i; j++) {
                    if ( i % j ==0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    checkSNT++;
                }
                count = 0;
            }else {
                break;
            }
        }
//        for (int i = 0; i < number; i++) {
//            if (checkPrime(i)) {
//                System.out.println(i);
//            }
//        }
    }
//    public static boolean checkPrime(int num) {
//        if (num <= 1)
//            return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
