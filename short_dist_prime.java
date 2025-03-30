import java.util.Scanner;
/**
 * This program finds the nearest "Twin Prime" pairs before and after a given number N.
 * 
 * Twin Primes are pairs of prime numbers that differ by exactly 2.
 * 
 * The program follows these steps:
 * - Takes an integer input (N) from the user.
 * - Searches for the closest twin prime pair greater than N.
 * - Searches for the closest twin prime pair smaller than N.
 * - Uses the `isPrime()` method to verify primality.
 * - Prints the closest twin prime pairs found.
 * 
 * Example 1:
 * Input: 10
 * Output:
 * TWIN NUMBERS AFTER 10 ARE 11, 13
 * TWIN NUMBERS BEFORE 10 ARE 5, 7
 * 
 * Example 2:
 * Input: 30
 * Output:
 * TWIN NUMBERS AFTER 30 ARE 41, 43
 * TWIN NUMBERS BEFORE 30 ARE 29, 31
 * 
 * The `isPrime()` function optimizes prime checking by:
 * - Skipping even numbers after checking for 2.
 * - Only checking divisibility up to the square root of the number.
 * - Iterating in steps of 2 to reduce unnecessary checks.
 */


public class short_dist_prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER N \n");
        int n= sc.nextInt();
        for(int i=n+1; ;i++){
            if(isPrime(i)&&isPrime(i+2)){
                System.out.println("TWIN NUMBERS BEFORE "+n+" ARE "+i+","+(i+2));
                break;
            }
        }
        for(int i=n-1; ;i--){
            if(isPrime(i)&&isPrime(i-2)){
                System.out.println("TWIN NUMBERS BEFORE "+n+" ARE "+i+","+(i-2));
                break;
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
