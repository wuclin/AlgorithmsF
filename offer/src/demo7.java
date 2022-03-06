/**
 * 斐波拉且
 */
public class demo7 {
    public int fib(int n) {
        int[] result = {0,1};
        if (n<2) {
            return result[n];
        }

        int fibone = 1;
        int fibtwo = 0;
        int fibn = 0;
        for (int i = 2; i <= n; i++) {
            fibn = (fibone + fibtwo)%1000000007;

            fibtwo = fibone;
            fibone = fibn;
        }
        return fibn;
    }
}
