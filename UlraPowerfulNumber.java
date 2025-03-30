/**
 * This program checks whether a given number is an "Ultra Powerful Number."
 * A number is considered Ultra Powerful if:
 * 1. The sum of its prime factors has the same "powerful structure" as the number itself.
 * 2. A number is "powerful" if every prime factor appears with at least a square (p^2) in its factorization.
 *
 * The program follows these steps:
 * - Takes an integer input from the user.
 * - Finds its prime factors and computes their sum.
 * - Checks whether both the number and the sum of its prime factors follow the same power pattern.
 * - Prints whether the number is Ultra Powerful or not.
 *
 * Example 1:
 * Input: 36
 * Prime Factors: {2, 3}
 * Sum of Prime Factors: 2 + 3 = 5
 * Since both 36 and 5 do not share the same power structure, output is:
 * "36 IS NOT AN ULTRA POWERFUL NUMBER"
 *
 * Example 2:
 * Input: 72
 * Prime Factors: {2, 3}
 * Sum of Prime Factors: 2 + 3 = 5
 * Similar logic applies, and output is:
 * "72 IS NOT AN ULTRA POWERFUL NUMBER"
 *
 * This program uses methods to:
 * - Extract prime factors of a number.
 * - Check if a number follows a "powerful number" structure.
 * - Compare the structure of the number with the sum of its prime factors.
 */

import java.util.*;

class UltraPowerfulNumber {

    int number;
    int sum;
    int k;

    public static void main(String[] args) {
        UltraPowerfulNumber U = new UltraPowerfulNumber();
        U.input();
        U.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        number = sc.nextInt();
    }

    void check() {

        int a[] = primeFactor(number);
        int g = k;
        int b[] = primeFactor(sum);
        int r = k;
        if (g == 1) {
            System.out.println(number + " IS NOT AN ULTRA POWERFUL NUMBER");
            System.exit(0);
        }
        if (isPowerfulOf(b, r, sum) == isPowerfulOf(a, g, number)) {
            System.out.println(number + " IS AN ULTRA POWERFUL NUMBER");
        } else {
            System.out.println(number + " IS AN NOT ULTRA POWERFUL NUMBER");
        }

    }

    int[] primeFactor(int cc) {
        sum=0;
        int arr[] = new int[10000];
        k = 0;
        for (int i = 2; i <= cc; i++) {
            if (cc % i == 0) {
                int count = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    arr[k++] = i;
                    sum = sum + arr[k - 1];
                }
            }
        }
        return arr;
    }

    boolean isPowerfulOf(int c[], int l, int cc) {
        if (l == 1) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < l; i++) {
            if (cc % Math.pow(c[i], 2) == 0) {
                count++;
            }
        }
        return count == l;
    }

}
