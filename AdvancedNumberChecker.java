
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
