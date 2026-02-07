public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && key >= arr[low] && key <= arr[high]) {
            if (low == high) {
                if (arr[low] == key) {
                    return low;
                }
                return -1;
            }

            int pos = low + ((key - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[pos] == key) {
                return pos;
            }

            if (arr[pos] < key) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1;
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

        int idx = interpolationSearch(arr, target);
        if (idx != -1) {
            System.out.println("Found " + target + " at index " + idx);
        } else {
            System.out.println(target + " not found");
        }
    }
}
