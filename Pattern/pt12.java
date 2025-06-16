package Pattern;
import java.util.*;
public class pt12 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=num;i++){
            
            for(int j=1;j<=num;j++){
                if(j<=i){
                    System.out.print(a+"\t");
                    c=a+b;
                    a=b;
                    b=c;
                }
            }
            System.out.println();
        }
    }
}
