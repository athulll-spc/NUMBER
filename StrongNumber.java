/**
 * This program checks for "Strong Numbers" within a given range.
 * 
 * A Strong Number is a number in which the sum of the factorials of its digits 
 * is equal to the number itself.
 * 
 * The program follows these steps:
 * - Takes a lower and upper boundary from the user.
 * - Iterates through each number in the range.
 * - Checks whether the number is a Strong Number.
 * - Prints all Strong Numbers found.
 * 
 * Example 1:
 * Input:
 * ENTER LOWER BOUNDARY: 1
 * ENTER UPPER BOUNDARY: 200
 * Output:
 * THE STRONG NUMBER IN THE GIVEN RANGE IS: 1    2    145  
 * 
 * Example 2:
 * Input:
 * ENTER LOWER BOUNDARY: 100
 * ENTER UPPER BOUNDARY: 500
 * Output:
 * THE STRONG NUMBER IN THE GIVEN RANGE IS: 145  
 * 
 * The program ensures:
 * - Uses the `fact()` method to compute factorial of digits.
 * - Uses the `check()` method to determine if a number is Strong.
 * - Accepts user input dynamically and iterates efficiently.
 */

import java.util.Scanner;

public class StrongNumber {
   static int n;
   static int m;

   public static void main(String[] args) {
      StrongNumber s = new StrongNumber();
      s.input();
      System.out.println("THE STRONG NUMBER INTHE GIVEN RANGE IS");
      for (int i = n; i <= m; i++) {
         if (i == s.check(i))
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

   int check(int cc) {
      int sum = 0;
      while (cc > 0) {
         sum = sum + fact(cc % 10);
         cc /= 10;
      }
      return sum;
   }

   int fact(int cc) {
      int sum = 1;
      for (int i = 2; i <= cc; i++) {
         sum = sum * i;
      }
      return sum;
   }

}
