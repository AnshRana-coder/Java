package Basic;
import java.util.Scanner;

public class printPrime {
    public static void main(String[] args){
            System.out.println("hello enter a no");
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            
            for(int j=2;j<=num;j++){
                boolean isprime=true;
                int i;
                for(i=2;i<=j/2;i++){
                    if(j%i==0){
                        isprime=false;
                        break;
                    }
                }
                if(isprime){
                    System.out.println(j);
                }
            }
            scn.close();
    }
}
