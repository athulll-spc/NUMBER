/**
 * This program finds and prints all "Circular Prime Numbers" within a given range.
 * 
 * A Circular Prime is a prime number that remains prime under all cyclic rotations 
 * of its digits.
 * 
 * Example:
 * - 197 is a circular prime because all its rotations (197, 971, 719) are prime.
 * - 1193 is also a circular prime: 1193, 1931, 9311, 3119 are all prime.
 * 
 * The program works as follows:
 * - Accepts lower and upper limits from the user.
 * - Iterates through each number in the range.
 * - For each number:
 *   - Generates all its circular digit rotations.
 *   - Checks if all the rotations are prime numbers.
 * - If all rotations are prime, the number is printed as a Circular Prime.
 */

import java.util.Scanner;

public class CircularPrime {

    static int n;
    static int m;
    static int len;

    public static void main(String[] args) {
        CircularPrime C = new CircularPrime();
        C.input();
        System.out.println("THE CIRCULAR PRIME  NUMBER IN THE GIVEN RANGE IS");
        for (int i = n; i <= m; i++) {
            if (C.isCircularPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LOWER BOUNDARY");
        n = sc.nextInt();
        System.out.println("ENTER UPPER BOUNDARY");
        m = sc.nextInt();
    }

    boolean isCircularPrime(int check) {
        len = (Integer.toString(check)).length();
        int arr[] = generateCombinaion(check);
        return isPrime(arr);
    }

    int[] generateCombinaion(int check) {
        int arr[] = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = (check % 10 * (int) Math.pow(10, len - 1)) + check / 10;
            check = arr[i];
        }
        return arr;
    }

    boolean isPrime(int arr[]) {
        int cc = 0;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                cc++;
            }
        }
        return (cc == len);
    }
}
