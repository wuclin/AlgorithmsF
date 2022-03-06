/**
 * 二维数组中的查找
 * 右上角的数有特殊的含义可以拿来比较
 */
public class demo2 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        boolean flag = false;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return flag;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0){
            if (matrix[row][col] == target)
            {
                flag = true;
                break;
            }
            if (matrix[row][col] > target)
                col--;
            else
                row++;
        }
        return flag;

    }
}
