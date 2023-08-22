package array;
/*
编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
 */
public class Search2DMatrix240 {
    public boolean searchMatrix(int[][] matrix, int target) {
/*        暴力解法遍历二维数组
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
             if (target == matrix[i][j]){
                 return true;
             }
            }
        }
        return false;*/

        //双指针
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = 0 , col = n-1;
        while (row < m && col >= 0){
            //先判断在几行
            if (target == matrix[row][col])return true;
            else if (target < matrix[row][col]) col--;
            else row++;
        }
        return false;
    }
}
