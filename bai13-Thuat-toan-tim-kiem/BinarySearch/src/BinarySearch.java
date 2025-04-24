public class BinarySearch {
    static int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            }else if (arr[mid] == target) {
                return arr[mid];
            }else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(arr, 7));
        System.out.println(search(arr, 10));
        System.out.println(search(arr, 50));
        System.out.println(search(arr, 79));
        System.out.println(search(arr, 80));
    }
}
