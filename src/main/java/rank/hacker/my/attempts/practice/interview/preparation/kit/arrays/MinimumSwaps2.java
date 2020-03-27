package rank.hacker.my.attempts.practice.interview.preparation.kit.arrays;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int minSwap = 0;
        int len = arr.length;
        int leftIndex = 0;
        boolean leftFirst = true;
        int pos = 0;

        //Run an infinite loop until you find the break point
        while (true) {

            boolean jump = true;

            //Start from the left most index and then check if the
            //index value + 1 == value at that index.
            //if they do not match then find the value of the element
            //at the index of the value and swap them.
            //continue till you have a sorted array.
            for (int i = leftIndex; i < len; i++) {

                System.out.println(pos++ + " : " +Arrays.toString(arr));

                if (arr[i] != i + 1) {

                    //This is to avoid traversing the same elements on
                    //the left side again and again.
                    if(leftFirst) {
                        leftIndex = i;
                        leftFirst = false;
                    }
                    //This indicates the array is not yet sorted.
                    jump = false;

                    int swap = arr[i];

                    //Swap only if you know the value on the right is
                    //smaller than the one on the left.
                    if (arr[swap - 1] < arr[i]) {
                        arr[i] = arr[swap - 1];
                        arr[swap - 1] = swap;
                        minSwap++;
                    }
                }
            }

            if(jump) break;
        }


        return minSwap;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

