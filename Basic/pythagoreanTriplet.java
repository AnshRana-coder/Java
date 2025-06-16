package Basic;
import java.util.*;
public class pythagoreanTriplet{
    public static void main(String[] args){
        System.out.print("ENter a no:");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        if(max==a){
            boolean flag=((b*b+c*c)==a*a);
            System.out.print(flag);
        }else if(max==b){
            boolean flag=((a*a+c*c)==b*b);
            System.out.print(flag);
        }else{
            boolean flag=((b*b+a*a)==c*c);
            System.out.print(flag);
        }
        
    }
}
