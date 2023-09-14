package search;
//二分查找
public class BinarySearch {
    public static int binarySearchBasic(int[] a , int target){
        int i = 0 , j = a.length - 1; //设置指针
        while(i <= j){//范围内有东西
            int m = (i + j) >>> 1;
            if (target < a[m]){
                //目标在左边
                j = m - 1 ;
            }else if (a[m] < target){
                //目标在右边
                i = m + 1;
            }else {
                //找到了
                return m;
            }
        }
        return -1;
    }
}
