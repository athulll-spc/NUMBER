
import java.util.*;

class UltraPowerfulNumber {

    int number;
    int sum;
    int k;

    public static void main(String[] args) {
        UltraPowerfulNumber U = new UltraPowerfulNumber();
        U.input();
        U.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        number = sc.nextInt();
    }

    void check() {

        int a[] = primeFactor(number);
        int g = k;
        int b[] = primeFactor(sum);
        int r = k;
        if (g == 1) {
            System.out.println(number + " IS NOT AN ULTRA POWERFUL NUMBER");
            System.exit(0);
        }
        if (isPowerfulOf(b, r, sum) == isPowerfulOf(a, g, number)) {
            System.out.println(number + " IS AN ULTRA POWERFUL NUMBER");
        } else {
            System.out.println(number + " IS AN NOT ULTRA POWERFUL NUMBER");
        }

    }

    int[] primeFactor(int cc) {
        sum=0;
        int arr[] = new int[10000];
        k = 0;
        for (int i = 2; i <= cc; i++) {
            if (cc % i == 0) {
                int count = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 1) {
                    arr[k++] = i;
                    sum = sum + arr[k - 1];
                }
            }
        }
        return arr;
    }

    boolean isPowerfulOf(int c[], int l, int cc) {
        if (l == 1) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < l; i++) {
            if (cc % Math.pow(c[i], 2) == 0) {
                count++;
            }
        }
        return count == l;
    }

}
