public class FibonacciSearch {
    public static int fibonacciSearch(int[] arr, int target) {
        int n = arr.length;
        int fibMMm2 = 0; // (m-2)'th Fibonacci number
        int fibMMm1 = 1; // (m-1)'th Fibonacci number
        int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci number

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, n - 1);

            if (arr[i] < target) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i] > target) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else {
                return i; // Target found
            }
        }

        if (fibMMm1 == 1 && offset + 1 < n && arr[offset + 1] == target) {
            return offset + 1; // Target found at the last position
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21 };
        int target = 13;
        if (args.length > 0) {
            try {
                target = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument, using default target: " + target);
            }
        }

        int idx = fibonacciSearch(arr, target);
        if (idx != -1) {
            System.out.println("Found " + target + " at index " + idx);
        } else {
            System.out.println(target + " not found");
        }
    }
}
