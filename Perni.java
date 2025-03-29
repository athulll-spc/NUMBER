import java.util.Scanner;

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
