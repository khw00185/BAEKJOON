import java.util.Scanner;

public class Main {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dt = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dt[i] = sc.nextInt();
        }
        dp[0] = dt[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            for(int j =0; j < i; j++){
                if(dt[j] < dt[i]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] += dt[i];
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
            sc.close();
    }
    public static void main(String[] args)
    {
        Main m = new Main();
        m.run();
    }
}