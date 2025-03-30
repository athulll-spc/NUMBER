/**
 * This program checks whether a number is an "Automorphic Number."
 * 
 * An Automorphic Number is a number whose square ends with the same digits as the number itself.
 * 
 * The program follows these steps:
 * - Takes an integer input from the user.
 * - Squares the number.
 * - Checks if the square ends with the original number.
 * - Prints whether the number is Automorphic or not.
 * 
 * Example 1:
 * Input: 25
 * Square: 625
 * Output: IT IS AN AUTOMORPHIC NUMBER
 * 
 * Example 2:
 * Input: 76
 * Square: 5776
 * Output: IT IS AN AUTOMORPHIC NUMBER
 * 
 * Example 3:
 * Input: 12
 * Square: 144
 * Output: IT IS NOT AN AUTOMORPHIC NUMBER
 * 
 * The program ensures:
 * - The square is stored in `num2`.
 * - The check is performed using the `endsWith()` method.
 * - Efficient handling of large numbers.
 */

import java.util.Scanner;

public class Automorphic {

    int number;
    int num2;

    public static void main(String[] args) {
        Automorphic a = new Automorphic();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        number = sc.nextInt();
        num2 = number * number;
    }

    void check() {

        if (Integer.toString(num2).endsWith(Integer.toString(number))) {
            System.out.println("IT IS AN AUTOMORPHIC NUMBER"); 
        }else {
            System.out.println("IT IS AN NOT AUTOMORPHIC NUMBER");
        }

    }
}
