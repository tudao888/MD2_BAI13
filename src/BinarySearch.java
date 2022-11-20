import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static boolean findLinear(int[] arr, int target) {
        for (int value : arr) {
            if (target == value) {
                return true;
            }
        }
        return false;
    }

    public static boolean findBinary(int[] arr, int target) {
        int start = 0;
        int stop = arr.length - 1;
        while (start <= stop) {
            int mid = ( start + stop ) / 2;
            if (target == arr[mid]) return true;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                stop = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {69, 96, 58, 12, 23, 1994, 63, 37, 17, 55};
        int target = 55;
        Arrays.sort(array);
        if (findBinary(array, target)) {
            System.out.println("Đã tìm thấy " + target);
        } else {
            System.out.println("Không tìm thấy " + target);
        }
    }

}
