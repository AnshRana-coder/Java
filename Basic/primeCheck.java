package Basic;
import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args){
            System.out.println("hello enter a no");
            Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int count=0;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("no is prime");
            }else{
                System.out.print("it is not");
            }
            scn.close();
    }
}
