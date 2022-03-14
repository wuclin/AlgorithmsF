/**
 * 数值的整数次方
 * 右移代替除法，位与运算代替取余来判断一个数是奇数还是偶数
 *
 */
public class demo15 {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
