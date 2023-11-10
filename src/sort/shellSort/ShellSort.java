package sort.shellSort;

public class ShellSort {

    public static void shellSort(int[] data) {
        System.out.println("开始排序");
        int arrayLength = data.length;

        int h = 1;
        while (h <= arrayLength / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            System.out.println("===h的值：" + h + "===");
            for (int i = h; i < arrayLength; i++) {
                int temp = data[i];
                if (data[i] - data[i - h] < 0) {
                    int j = i - h;
                    for (; j >= 0 && data[j] - temp > 0; j -= h) {
                        data[j + h] = data[j];
                    }
                    data[j + h] = temp;
                }
                System.out.println(java.util.Arrays.toString(data));
            }
            h = (h - 1) / 3;
        }
    }

}
