
import java.util.Scanner;

public class KeithNumberChecker {

    static int n;
    static int m;
    int k;

    public static void main(String[] args) {
        KeithNumberChecker K = new KeithNumberChecker();
        K.input();
        System.out.println("KAITH NUMBERS ARE");
        for (int i = n; i <= m; i++) {
            if (K.isKaithNumber(i)) {
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
        sc.close();
    }
    int s;

    boolean isKaithNumber(int number) {
        s = Integer.toString(number).length();
        int arr[] = generateSequence(number);
       return arr[k-1]==number;
    }

    int[] generateSequence(int check) {
        int[] arr = new int[100];
        k = 0;
        for (int i = 0; i < s; i++) {
            arr[k++] = Integer.parseInt(String.valueOf(Integer.toString(check).charAt(i)));
        }
        int lastterm = 0;
        while (check > lastterm) {
            lastterm = 0;
            for (int i = k - s; i <= k; i++) {
                lastterm = lastterm + arr[i];
            }
            arr[k++] = lastterm;
        }
        return arr;
    }
}
