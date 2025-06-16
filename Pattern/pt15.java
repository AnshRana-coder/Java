package Pattern;
import java.util.*;
public class pt15 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int sp=num/2;
        int st=1;
        int val=1;
        for(int i=1;i<=num;i++){
            int cval=val;
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=st;j++){
                System.out.print(cval);
                if(cval<=st/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            if(i<=num/2){
                st=st+2;
                sp--;
                val++;
            }else{
                st-=2;
                sp++;
                val--;
            }
            System.out.println();
        }

    }
}
