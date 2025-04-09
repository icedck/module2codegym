//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a[] = {1,2,3,4};
//        int arr1[] = changeFirstElement(a);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }

            int[] a = {50, 100};
            m(a);
            System.out.println(a[0]);


    }
    public static void m(int[] x) {
        x[0] = 200;
    }
//    public static int[] changeFirstElement(int[] arr) {
//        arr[0] = 100;
//        return arr;
//    }
}