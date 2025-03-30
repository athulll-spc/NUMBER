import java.util.Scanner;
/**
 * This program checks whether a given binary number is a "Pernicious Number."
 * 
 * A Pernicious Number is a number whose binary representation contains 
 * a prime number of '1' bits.
 * 
 * The program follows these steps:
 * - Takes a binary number as input.
 * - Counts the number of '1' bits in the binary representation.
 * - Checks if the count is a prime number.
 * - Prints whether the number is Pernicious or not.
 * 
 * Example 1:
 * Input: 1011 (binary for 11)
 * Count of '1's = 3 (which is prime)
 * Output: 1011 IS A PERNICIOUS NUMBER
 * 
 * Example 2:
 * Input: 10010 (binary for 18)
 * Count of '1's = 2 (which is prime)
 * Output: 10010 IS A PERNICIOUS NUMBER
 * 
 * Example 3:
 * Input: 1000 (binary for 8)
 * Count of '1's = 1 (not prime)
 * Output: 1000 IS NOT A PERNICIOUS NUMBER
 * 
 * The program ensures:
 * - The number is read as a binary integer.
 * - The count of '1' bits is calculated using `countOne()`.
 * - Primality is checked using a loop in `check()`.
 */

public class Perni {
    int  num;
    Perni(){
        num=0;
    }
    void accept(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("ENTER THE BINARY NUMBER");
        num= sc.nextInt();
    }
    int countOne(int k){
        int count=0;
      while(k>0){
          if(k%10==1)
              count++;
          k/=10;
      }
      return count;
    }
    void check(){
        System.out.println(countOne(num));
        int count=0;
        for(int i=1;  i<=countOne(num) ; i++){
            if(countOne(num)%i==0)
                count++;
        }
        if(count==2)
            System.out.println(num+" IS A PERNIOUS NUMBER");
        else
            System.out.println(num+" IS A  NOT  PERNIOUS NUMBER");
    }

    public static void main(String[] args) {
        Perni P =  new Perni();
        P.accept();
        P.check();
    }

}
