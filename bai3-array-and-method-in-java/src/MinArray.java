public class MinArray {
    public static void main(String[] args) {
        int[] arr1 = {11,22,44,1};
        System.out.println(minElement(arr1));
    }
    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
