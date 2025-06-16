package Basic;
import java.util.*;
public class fabonaci {
    public static void main(String[] args){
        System.out.println("Hello enter a no");
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int i;
        int a=0;
        int b=1;
        int c;
        System.out.print("Seris:"+a+b);
        for(i=3;i<=num;i++){

            c=a+b;
            a=b;
            b=c;
            System.out.print(b);
        }
        
    }
}
