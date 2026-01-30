public class UniformBinarySearch {
    static int[] lookupTable = {1, 2, 4, 8, 16, 32, 64, 128};
    static int[] stepSizeTable = {1, 2, 4, 8, 16, 32, 64, 128};
    
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
}