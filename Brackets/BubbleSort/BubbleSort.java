
public class BubbleSort {
    public static void sort(int[] arr) {
        int arrSize = arr.length;
        
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}