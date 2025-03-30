
/**
 * This program checks for "UltraFactorial Numbers," where the sum of factorials
 * from 1! to N! forms a perfect power (X^Y) with X > 1 and Y > 1.
 * It calculates the factorial sum and verifies if it can be expressed as X^Y.
 *
 * Example 1:
 * N = 3
 * Sum = 1! + 2! + 3! = 1 + 2 + 6 = 9
 * 9 is a perfect power (3^2), so N = 3 is an UltraFactorial Number.
 *
 * Example 2:
 * N = 4
 * Sum = 1! + 2! + 3! + 4! = 1 + 2 + 6 + 24 = 33
 * 33 is NOT a perfect power, so N = 4 is NOT an UltraFactorial Number.
 *
 * Only N = 3 is an UltraFactorial Number for N ≤ 30.
 */

import java.util.Scanner;

public class UltraFactorialNumber {

    static int number;

    public static void main(String[] args) {
        UltraFactorialNumber U = new UltraFactorialNumber();
        U.input();
        int arr[] = U.calculate(number);
        if (arr[0] == 0 || arr[1] == 0) {
            System.out.println("IT CANT BE A ULTRA FACTORIAL NUMBER");
        } else {
            System.out.println("IT IS A ULTRA FACTORIAL NUBBER WITH BASE " + arr[0] + " AND POWER " + arr[1]);
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int num = sc.nextInt();
        int cc = 1;
        for (int j = 1; j <= num; j++) {
            for (int i = 1; i <= j; i++) {
                cc = cc * i;
            }
            number = number + cc;
            cc = 1;
        }
        sc.close();
    }

    int[] calculate(int check) {
        int[] ar = new int[2];
        for (int i = 2; i < check; i++) {
            for (int j = 2; Math.pow(i, j) <= check; j++) {
                if (Math.pow(i, j) == check) {
                    ar[0] = i;
                    ar[1] = j;
                    return ar;
                }

            }
        }
        return ar;
    }

}
