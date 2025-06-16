package Basic;
import java.util.*;
public class primeFactorisation {
    public static void main(String[] args){
        System.out.print("ENter a no:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                num=num/i;
                System.out.println(i);
            }
        }
        if(num!=1){
            System.out.println(num);
        }
    }
}
