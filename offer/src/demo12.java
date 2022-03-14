/**
 * 剪绳子1
 * 有贪婪和动态规划两种
 * dp[i]表示长度为i的绳子剪短之后乘积的最大值
 */
public class demo12 {
    public static void main(String[] args){
        demo12 demo12 = new demo12();
        System.out.println(demo12.cuttingRope(10));;
    }

    public int cuttingRope(int n) {

        if(n < 2)
            return 0;
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= n; i++){

            for (int j = 1; j <= i/2; j++){
                dp[i] = Math.max(dp[i], dp[j]*dp[i-j]);
            }
        }

        return dp[n];
    }
}
