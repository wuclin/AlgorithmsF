import java.util.Arrays;

/**
 * 机器人的运动路径，回溯
 */
public class demo11 {

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int count = backtrace(m, n, 0, 0, k, visited);
        return count;
    }

    public int backtrace(int m, int n, int row, int col, int k, boolean[][] visited)
    {
     if (row >= m || row < 0 || col >= n || col < 0 || visited[row][col] || k < getNum(col)+getNum(row))
         return 0;

     visited[row][col] = true;
     int count = 1 + backtrace(m, n, row + 1, col, k, visited) + backtrace(m, n, row - 1, col, k, visited)
                   + backtrace(m, n, row, col + 1, k, visited) + backtrace(m, n, row, col - 1, k, visited);
     return count;
    }

    public int getNum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
