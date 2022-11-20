import java.util.Arrays;
import java.util.Scanner;

public class BSTsuDungDeQuy {
    int binarySearch(int array[], int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            // If found at mid, then return it
            if (array[mid] == x)
                return mid;
            // Search the left half
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);
            // Search the right half
            return binarySearch(array, x, mid + 1, high);
        }
        return -1;
    }
    public static void main(String args[]) {
        BSTsuDungDeQuy ob = new BSTsuDungDeQuy();
        int array[] = { 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;
        int x = 4;
        int result = ob.binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
//    int binarySearch(int[] array, int start, int stop , int value) {
//        int mid = ( start + stop ) / 2;
//        while (stop >= start) {
//            if (value == array[mid]) return mid;
//            if (value > array[mid]) {
//                start = mid + 1;
//            }
//            else {
//                stop = mid - 1;
//            }
//        }
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        BSTsuDungDeQuy bsTsuDungDeQuy = new BSTsuDungDeQuy();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số lượng phần tử:");
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập vào phần tử thứ: " + (i+1));
//            arr[i] = scanner.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println("Nhập vào giá trị cần tìm: ");
//        int x = scanner.nextInt();
//        int result = bsTsuDungDeQuy.binarySearch(arr, 0, (arr.length - 1), x);
//        System.out.println(result);
//        if (result == - 1) {
//            System.out.println(x + " Không nằm trong dãy");
//        } else {
//            System.out.println(x + " Nằm trong dãy");
//        }
//    }

}
