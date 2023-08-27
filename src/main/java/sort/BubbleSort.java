package sort;

public class BubbleSort {
    //冒泡排序
    public static void bubbleSort1(int[] a) {
        int tep = 0;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]){
                    tep = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tep;
                }
            }
        }
    }
}
