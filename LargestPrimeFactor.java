
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

