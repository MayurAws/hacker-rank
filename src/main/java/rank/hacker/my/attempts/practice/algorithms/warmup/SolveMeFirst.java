package rank.hacker.my.attempts.practice.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {

    static int solve(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solve(a, b);
        System.out.println(sum);
    }
}
