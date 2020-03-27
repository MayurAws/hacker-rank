package rank.hacker.my.attempts.practice.algorithms.implementaion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

        Set<Integer> colorSet = new HashSet<>();

        int finalSockCount = 0;

        for (int i = 0; i < n; i++) {
            if(!colorSet.contains(ar[i])) {
                colorSet.add(ar[i]);
            } else {
                finalSockCount++;
                colorSet.remove(ar[i]);
            }
        }

        return finalSockCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
