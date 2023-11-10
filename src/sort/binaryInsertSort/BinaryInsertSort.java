package sort.binaryInsertSort;

public class BinaryInsertSort {

    public static void binaryInsertSort(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 1; i < arrayLength; i++) {
            int temp = data[i];
            int low = 0;
            int high = i - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (temp > data[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            for (int j = i; j > low; j--) {
                data[j] = data[j - 1];
            }
            data[low] = temp;
            System.out.println(java.util.Arrays.toString(data));
        }

    }
}
