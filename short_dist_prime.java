import java.util.Scanner;

public class short_dist_prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER N \n");
        int n= sc.nextInt();
        for(int i=n+1; ;i++){
            if(isPrime(i)&&isPrime(i+2)){
                System.out.println("TWIN NUMBERS BEFORE "+n+" ARE "+i+","+(i+2));
                break;
            }
        }
        for(int i=n-1; ;i--){
            if(isPrime(i)&&isPrime(i-2)){
                System.out.println("TWIN NUMBERS BEFORE "+n+" ARE "+i+","+(i-2));
                break;
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
