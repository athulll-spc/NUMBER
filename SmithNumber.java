import java.util.ArrayList;
import java.util.Scanner;

class SmithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LIMIT");
        int n = sc.nextInt();
        sc.close();

        for (int i = 2; i <= n; i++) {
            if (isSmith(i)) {
                System.out.println("SMITH NUMBER: " + i);
            }
        }
    }

    // Method to check if a number is a Smith Number
    public static boolean isSmith(int num) {


        int sumOfDigits = sumOfDigits(num);
        int sumOfFactorDigits = sumOfDigitsOfFactors(num);

        return sumOfDigits == sumOfFactorDigits;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to find the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Method to get prime factors and sum of their digits
    public static int sumOfDigitsOfFactors(int num) {
        int sum = 0;
        int factor = 2;

        while (num > 1) {
            while (num % factor == 0) {
                sum += sumOfDigits(factor);
                num /= factor;
            }
            factor++;
        }
        return sum;
    }
}
