package AlgorithmicToolbox.Welcome;

import java.util.Scanner;

public class FiboSumLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 1) {
            System.out.println(n);
        } else {
            int[] f = new int[n + 1];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i <= n; i++) {
                f[i] = (f[i - 1] + f[i - 2]) % 10;
            }
            System.out.println(f[n]);
        }
    }
}
