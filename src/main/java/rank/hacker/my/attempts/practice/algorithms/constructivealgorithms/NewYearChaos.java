package rank.hacker.my.attempts.practice.algorithms.constructivealgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int position = 0;
        boolean chaotic = false;
        int totalSwaps = 0;
        int counter = 0;


        for (int i = 0; i < q.length; i++) {

            position = q[i] - (i + 1);

            if (position > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++) {
                System.out.println(counter++ + "  : " + Arrays.toString(q));
                if (q[j] > q[i]) {
                    totalSwaps++;
                }
            }
        }

        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(totalSwaps);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
