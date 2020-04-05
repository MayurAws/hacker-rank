package rank.hacker.my.attempts.practice.interview.preparation.kit.arrays;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];

        int lower, upper;
        long sum;

        System.out.println(LocalDateTime.now());

        for (int[] query : queries) {
            lower = query[0];
            upper = query[1];
            sum = query[2];
            arr[lower - 1] = arr[lower - 1] + sum;
            if (upper < n) {
                arr[upper] = arr[upper] - sum;
            }
        }

        long[] max = new long[1];
        long[] temp = new long[1];

        IntStream.range(0, n).forEach(value -> {
            temp[0] = temp[0] + arr[value];
            if (temp[0] > max[0]) {
                max[0] = temp[0];
            }
        });

        System.out.println(LocalDateTime.now());

        return max[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

