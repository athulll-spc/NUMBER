
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
