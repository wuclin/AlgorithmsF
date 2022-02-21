import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * N皇后
 */
public class demo2 {
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] broad = new char[n][n];
        for (char[] c : broad)
            Arrays.fill(c, '.');
        backtrace(broad, 0);
        return res;
    }

    public void backtrace(char[][] broad, int row){
        int n = broad.length;
        if (row == n){
            res.add(array2String(broad));
            return;
        }

        for (int col = 0; col < n; col++){
            if (!IsVaild(broad, row, col))
                continue;

            broad[row][col] = 'Q';
            backtrace(broad, row+1);
            broad[row][col] = '.';
        }

    }
    public boolean IsVaild(char[][] broad, int row, int col){
        int n = broad.length;
        for(int i = 0; i < n; i++){
            if (broad[i][col] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0&& j >= 0; i--,j--)
        {
            if (broad[i][j] == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0&& j <= n - 1; i--, j++){
            if (broad[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public List<String> array2String(char[][] broad){
        List<String> trace = new ArrayList<>();
        for (char[] c : broad)
            trace.add(String.copyValueOf(c));
        return trace;
    }
}

