/**
 * This program finds and prints all "Twin Primes" up to a given upper limit.
 * 
 * Twin Primes are pairs of prime numbers that differ by exactly 2.
 * 
 * The program follows these steps:
 * - Takes an integer input (upper limit) from the user.
 * - Iterates through numbers up to the given limit, checking for twin primes.
 * - Uses the `isPrime()` method to verify primality.
 * - If both numbers in the pair are prime, they are printed as a twin prime pair.
 * 
 * Example 1:
 * Input: 20
 * Output:
 * Twin Primes up to 20 are:
 * 3   5
 * 5   7
 * 11  13
 * 17  19
 * 
 * Example 2:
 * Input: 50
 * Output:
 * Twin Primes up to 50 are:
 * 3   5
 * 5   7
 * 11  13
 * 17  19
 * 29  31
 * 41  43
 * 
 * The `isPrime()` function optimizes prime checking by:
 * - Skipping even numbers after checking for 2.
 * - Only checking divisibility up to the square root of the number.
 * - Iterating in steps of 2 to reduce unnecessary checks.
 */

import java.util.Scanner;

public class TwinPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE UPPER LIMIT: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("TWIN PRIMES UP TO " + n + " ARE:");
        for (int i = 2; i <= n - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println(i + "\t" + (i + 2));
            }
        }
    }

    public static boolean isPrime(int k) {
        if (k < 2) return false;
        if (k == 2) return true;
        if (k % 2 == 0) return false;

        for (int i = 3; i * i <= k; i += 2) {
            if (k % i == 0) return false;
        }
        return true;
    }
}
