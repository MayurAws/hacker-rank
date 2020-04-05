package rank.hacker.my.attempts.practice.interview.preparation.kit.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {

        int swapCount = 0;
        boolean quit = true;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    quit = false;
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapCount++;
                }
            }
            if (quit) break;
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }

}
