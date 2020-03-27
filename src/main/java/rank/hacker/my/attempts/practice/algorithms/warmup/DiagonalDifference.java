package rank.hacker.my.attempts.practice.algorithms.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int rightToLeft = 0;
        int leftToRight = 0;

        for (int i = 0; i < arr.size(); i++) {

            for (int j = i; j < arr.get(i).size(); j++) {
                rightToLeft = rightToLeft + arr.get(i).get(j);
                break;
            }

            for (int k = arr.get(i).size() - 1 - i; k >= 0; k--) {
                leftToRight = leftToRight + arr.get(i).get(k);
                break;
            }

        }

        System.out.println("rr".charAt(0) > "bb".charAt(0));
        System.out.println("bb".charAt(0));

        return 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String s = "mayur d shanbhag";

        Arrays.stream(s.split("A-Za-z"));

        int result = DiagonalDifference.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
