package sort.bucketSort;

import java.util.Arrays;

public class BucketSort {

    public static void bucketSort(int[] data, int min, int max) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        int[] temp = new int[arrayLength];
        int[] buckets = new int[max - min];
        for (int i = 0; i < arrayLength; i++) {
            buckets[data[i] - min]++;
        }
        System.out.println(Arrays.toString(buckets));
        for (int i = 1; i < max - min; i++) {
            buckets[i] = buckets[i] + buckets[i - 1];
        }
        System.out.println(Arrays.toString(buckets));
        System.arraycopy(data, 0, temp, 0, arrayLength);
        for (int k = arrayLength - 1; k >= 0; k--) {
            data[--buckets[temp[k] - min]] = temp[k];
        }
    }


}
