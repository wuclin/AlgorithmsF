/**
 * 青蛙爬台阶
 */
public class demo8 {
    public int numWays(int n) {
        if (n == 0 || n == 1) return 1;
        int way1 = 1;
        int way2 = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (way1 + way2) % 1000000007;
            way1 = way2;
            way2 = sum;
        }

        return way1;
    }
}
