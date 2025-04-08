public class DisplayPrimeNumbersLessThan100 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 0; i < num; i++) {
            if (checkPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
