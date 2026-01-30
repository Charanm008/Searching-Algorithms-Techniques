public class LinearSearchEx {
    private static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("-1");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;
        linearSearch(arr, key);
    }
}