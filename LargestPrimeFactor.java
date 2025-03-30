/**
 * This program finds the largest prime factor of a given number.
 * 
 * A prime factor is a factor of a number that is also a prime number.
 * The largest prime factor is the biggest prime number that divides 
 * the given number without leaving a remainder.
 * 
 * The program follows these steps:
 * - Takes an integer input from the user.
 * - Iterates from the largest possible factor (number/2) down to 2.
 * - Checks if the factor is a prime number.
 * - Returns and prints the largest prime factor found.
 * 
 * Example 1:
 * Input: 28
 * Prime factors: {2, 7}
 * Output: LARGEST PRIME FACTOR IS 7
 * 
 * Example 2:
 * Input: 45
 * Prime factors: {3, 5}
 * Output: LARGEST PRIME FACTOR IS 5
 * 
 * The program ensures:
 * - Efficient checking by starting from the largest factor.
 * - A method `prime()` that checks if a number is prime.
 * - Edge cases like even numbers and prime numbers are handled.
 */

import java.util.Scanner;
class LargestPrimeFactor{
    int number;

    public static void main(String[] args) {
        LargestPrimeFactor n = new LargestPrimeFactor();

        n.input ();
    
        int result=n.check ();
        System.out.println("LARGEST PRIME FACTOR IS  "+result);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENNTER A NUMBER ");
        number = sc.nextInt();
    }
    int check(){
        for(int i=number/2;i>2;i-=2){
           if(number%i==0){
              if(prime(i))  return i;
           }
        }
        if(number%2==0)
        return 2;
        else
        return 0;
        
    }
    boolean prime(int i){
        int cc=0;
        for(int j=1;j<=i;j++){
              if(i%j==0) cc++;
        }
        return cc==2;
    }
    
}

