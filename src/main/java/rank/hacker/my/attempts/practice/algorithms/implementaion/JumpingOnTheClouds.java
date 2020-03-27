package rank.hacker.my.attempts.practice.algorithms.implementaion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int len = c.length;
        System.out.println(len);

        int jumpCount = 0;
        // 0 0 0 0 1 0

        int i = 0;

        while(i < len - 1) {
            if (c[i] == 0) {
                if (i <= len - 3 && c[i + 2] == 0) {
                    jumpCount++;
                    i = i + 2;
                } else if (i <= len - 2 && c[i + 1] == 0) {
                    jumpCount++;
                    i++;
                }
            }
        }

        return jumpCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
