package sort.insertSort;

public class InsertSort {

    public static void insertSort(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 1; i < arrayLength; i++) {
            int temp = data[i];
            if (data[i] - data[i - 1] < 0) {
                int j = i - 1;
                for (; j >= 0 && data[j] - temp > 0; j--) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;
            }
            System.out.println(java.util.Arrays.toString(data));
        }

    }
}
