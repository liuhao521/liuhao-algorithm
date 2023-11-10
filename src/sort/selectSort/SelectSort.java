package sort.selectSort;

public class SelectSort {

    public static void selectSort(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (data[i] - data[j] > 0) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
            System.out.println(java.util.Arrays.toString(data));
        }
    }

    public static void selectSort1(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (data[minIndex] - data[j] > 0) {
                    minIndex = j;

                }
            }
            if(minIndex != i){
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
            System.out.println(java.util.Arrays.toString(data));
        }
    }

}
