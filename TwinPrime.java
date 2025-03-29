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
