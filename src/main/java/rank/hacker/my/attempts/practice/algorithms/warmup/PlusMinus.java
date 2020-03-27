package rank.hacker.my.attempts.practice.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int pos = 0;
        int neg = 0;
        int zer = 0;

        int len = arr.length;

        for(int i = 0; i < len; i++) {

            if(arr[i] > 0) {
                pos++;
            } else if(arr[i] < 0) {
                neg++;
            } else {
                zer++;
            }
        }

        System.out.println((float)pos/(float)len);
        System.out.println((float)neg/(float)len);
        System.out.println((float)zer/(float)len);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }


}
