package rank.hacker.my.attempts.practice.algorithms.implementaion;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        String myString = s;

        int initLen = myString.length();
        String myNextString = myString.replaceAll("a", "").trim();
        int finalLen = myNextString.length();

        int repeatCount = initLen - finalLen;

        long count = n / s.length();
        int countMod = (int) (n % s.length());

        int trimmedLen = countMod - s.substring(0, countMod).replaceAll("a", "").length();

        long finalCount = repeatCount * count + trimmedLen;

        return finalCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
