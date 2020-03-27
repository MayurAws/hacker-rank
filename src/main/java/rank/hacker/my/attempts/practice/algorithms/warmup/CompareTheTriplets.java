package rank.hacker.my.attempts.practice.algorithms.warmup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int a1 = 0;
        int b1 = 0;

        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                a1++;
            } else if(b.get(i) > a.get(i)) {
                b1++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(a1);
        result.add(b1);

        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
