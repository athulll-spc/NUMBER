/**
 * This program checks for "Keith Numbers" within a given range.
 * 
 * A Keith Number is a special number in which:
 * - Its digits form the first few terms of a sequence.
 * - Each term is the sum of the previous 'd' terms (where 'd' is the number of digits in the number).
 * - If the number itself appears in this sequence, it is a Keith Number.
 * 
 * The program follows these steps:
 * - Takes a lower and upper boundary from the user.
 * - Iterates through each number in the range.
 * - Checks whether the number is a Keith Number.
 * - Prints all Keith Numbers found.
 * 
 * Example 1:
 * Input:
 * ENTER LOWER BOUNDARY: 10
 * ENTER UPPER BOUNDARY: 100
 * Output:
 * KEITH NUMBERS ARE 14    19    28    47    61    75  
 * 
 * Example 2:
 * Input:
 * ENTER LOWER BOUNDARY: 100
 * ENTER UPPER BOUNDARY: 500
 * Output:
 * KEITH NUMBERS ARE 197    742
 * 
 * The program ensures:
 * - Efficient sequence generation using an array.
 * - Uses the `generateSequence()` method to form the sequence dynamically.
 * - Checks whether the original number appears in the sequence.
 */

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
