package rank.hacker.my.attempts.practice.datastructures.arrays;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class HourGlassSum {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int len = arr[0].length;
        int sum = 0;
        int rows = 1;
        int columns = 0;
        int count = 1;
        int loop = 0;
        int total = Integer.MIN_VALUE;

        while(true) {
            for (int i = rows; i < rows + 3; i++) {

                for (int j = columns; j < columns + 3; j++) {

                    if(count == 1) {
                        sum = sum + arr[rows - 1][j];
                    } else if(count == 2) {
                        if(j == columns + 1) {
                            sum = sum + arr[rows][j];
                            break;
                        }
                    } else if (count == 3){
                        sum = sum + arr[rows + 1][j];
                    }
                }
                count++;
            }
            columns++;
            loop++;
            count = 1;

            if(total < sum) {
                total = sum;
            }
            sum = 0;

            if(columns == len - 2) {
                rows++;
                columns = 0;
            }

            if(loop == Math.pow(len - 2, 2)) {
                break;
            }
        }

        return total;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
