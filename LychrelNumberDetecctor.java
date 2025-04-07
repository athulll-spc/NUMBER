/**
 * This program checks for "Lychrel Numbers" within a given range.
 * 
 * A Lychrel Number is a number that does not form a palindrome
 * even after repeatedly reversing and adding its digits.
 * 
 * The program:
 * - Takes a lower and upper boundary from the user.
 * - Iterates through each number in the range.
 * - Repeatedly reverses and adds the number up to 50 times.
 * - If no palindrome is formed within 50 iterations, it is considered a Lychrel Number.
 * - Prints all such numbers found in the range.
 */

 import java.util.*;

 class LychrelNumberDetector {
     static int n;
     static int m;
 
     public static void main(String[] args) {
         LychrelNumberDetector l = new LychrelNumberDetector();
         l.input();
         System.out.println("THE LYCHREL NUMBER IN THE GIVEN RANGE IS");
         for (int i = n; i <= m; i++) {
             if (l.isLychrel(i))
                 System.out.print(i + "\t");
         }
     }
 
     void input() {
         Scanner sc = new Scanner(System.in);
         System.out.println("ENTER LOWER BOUNDARY");
         n = sc.nextInt();
         System.out.println("ENTER UPPER BOUNDARY");
         m = sc.nextInt();
     }
 
     boolean isLychrel(int num) {
         for (int i = 1; i <= 50; i++) {
             int rev = reverse(num);
             num = num + rev;
             if (isPalindrome(num))
                 return false;
         }
         return true;
     }
 
     boolean isPalindrome(int num) {
         int original = num;
         int rev = 0;
         while (num > 0) {
             rev = rev * 10 + (num % 10);
             num /= 10;
         }
         return rev == original;
     }
 
     int reverse(int num) {
         int rev = 0;
         while (num > 0) {
             rev = rev * 10 + (num % 10);
             num /= 10;
         }
         return rev;
     }
 }
 