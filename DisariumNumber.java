/**
 * This program finds and prints all "Disarium Numbers" within a given range.
 * 
 * A Disarium Number is a number in which the sum of its digits 
 * raised to the power of their respective positions equals the number itself.
 * 
 * Example:
 * - 89 is a Disarium number because: 8^1 + 9^2 = 8 + 81 = 89
 * - 135 is also a Disarium number: 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
 * 
 * The program performs the following steps:
 * - Takes lower and upper boundaries as input from the user.
 * - Iterates through the numbers in the range.
 * - Checks each number for the Disarium property.
 * - Prints all valid Disarium Numbers found in the given range.
 */

 import java.util.Scanner;

 public class DisariumNumber {
 
     static int n;
     static int m;
 
     public static void main(String[] args) {
         DisariumNumber D = new DisariumNumber();
         D.input();
         System.out.println("THE DISARIUMM NUMBER IN THE GIVEN RANGE IS");
         for (int i = n; i <= m; i++) {
             if (D.isDisarium(i)) {
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
 
     boolean isDisarium(int check) {
         int cc = check;
         int len = (Integer.toString(check)).length();
         int sum = 0;
         while (check > 0) {
             sum = sum + (int) (Math.pow(check % 10, len--));
             check /= 10;
         }
         return (sum == cc);
     }
 }
 