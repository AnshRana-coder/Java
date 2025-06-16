package Pattern;
import java.util.*;
public class pt6 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int sp=num/2+1;
        int st=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("*");
            }
            for(int j=1;j<=st;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("*");
            }
            if(i<=num/2){
                st=st+2;
                sp--;
            }else{
                st-=2;
                sp++;
            }
            System.out.println();
        }

    }
}
