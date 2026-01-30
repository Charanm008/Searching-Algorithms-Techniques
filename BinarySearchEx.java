public class BinarySearchEx {
    private static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int key = 60;
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("-1");
        }
    }
}
