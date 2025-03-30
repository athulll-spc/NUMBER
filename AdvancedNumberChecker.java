/**
 * This program checks whether a given number satisfies different mathematical properties.
 * 
 * The number is tested for:
 * 1. **Prime Number**: A number greater than 1 that has only two factors (1 and itself).
 * 2. **Armstrong Number**: A number that is equal to the sum of its own digits each raised to the power of the number of digits.
 * 3. **Palindrome**: A number that reads the same forward and backward.
 * 4. **Perfect Number**: A number that is equal to the sum of its proper divisors (excluding itself).
 * 
 * The program works as follows:
 * - The user inputs a number.
 * - The program checks and prints whether the number satisfies each of the above conditions.
 * 
 * Example 1:
 * Input: 153
 * Output:
 * PRIME  :  false
 * ARMSTRONG  :  true
 * PALINDROME  :  false
 * PERFECT  :  false
 * 
 * Example 2:
 * Input: 28
 * Output:
 * PRIME  :  false
 * ARMSTRONG  :  false
 * PALINDROME  :  false
 * PERFECT  :  true
 * 
 * Example 3:
 * Input: 131
 * Output:
 * PRIME  :  true
 * ARMSTRONG  :  false
 * PALINDROME  :  true
 * PERFECT  :  false
 */

import java.util.Scanner;

public class AdvancedNumberChecker {

    int number;

    public static void main(String[] args) {
        AdvancedNumberChecker A = new AdvancedNumberChecker();
        A.input();
        A.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        number = sc.nextInt();
    }

    void display() {
        System.out.println("PRIME  :  " + isPrime(number));
        System.out.println("ARMSTRONG  :  " + isArmstrong(number));
        System.out.println("PALINDROME  :  " + isPalindrome(number));
        System.out.println("PERFECT  :  " + isPerfect(number));
    }

    boolean isPrime(int i) {
        int cc = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                cc++;
            }
        }
        return cc == 2;
    }

    boolean isArmstrong(int check) {
        int original = check;
        int sum = 0;
        int numDigits = String.valueOf(check).length();
        while (check > 0) {
            int digit = check % 10;
            sum += Math.pow(digit, numDigits);
            check /= 10;
        }
        return sum == original;
    }
    

    boolean isPalindrome(int check) {
        if (Integer.toString(check).length() == 1) {
            return false;
        }
        int rev = 0;
        while (check > 0) {
            rev = rev * 10 + check % 10;
            check /= 10;
        }
        return rev == number;
    }

    boolean isPerfect(int check) {
        int sum = 0;
        for (int i = 1; i <= check / 2; i++) {
            if (check % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }

}
