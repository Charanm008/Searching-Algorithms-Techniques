public class UniformBinarySearch {
    static int[] lookupTable = { 1, 2, 4, 8, 16, 32, 64, 128 };
    static int[] stepSizeTable = { 1, 2, 4, 8, 16, 32, 64, 128 };

    static int uniformBinarySearch(int[] array, int size, int target) {
        int low = 0;
        int high = size - 1;
        int step = 0;

        while (low <= high) {
            int mid = low + ((high - low) / stepSizeTable[step]);
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            step++;
            if (step >= stepSizeTable.length) {
                step = stepSizeTable.length - 1;
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

        int idx = uniformBinarySearch(arr, arr.length, target);
        if (idx != -1) {
            System.out.println("Found " + target + " at index " + idx);
        } else {
            System.out.println(target + " not found");
        }
    }
}
