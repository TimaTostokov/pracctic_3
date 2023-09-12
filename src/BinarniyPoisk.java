import static java.util.Arrays.binarySearch;

public class BinarniyPoisk {
    public static void main(String[] args) {
        //бинарный поикс
        int[] value = {-5, 8, 7, 343, 234, 1200};
        int valueFind = 234;

        System.out.println(binarySearch(value, valueFind));
    }

    private static int binarySearch(int[] values, int valueFind) {
        int index = -1;
        int low = 0;
        int high = values.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values[mid] < valueFind) {
                low = mid + 1;
            } else if (values[mid] > valueFind) {
                high = mid - 1;
            } else if (values[mid] == valueFind) {
                index = mid;
                break;

            }
        }
        return index;
    }
}
