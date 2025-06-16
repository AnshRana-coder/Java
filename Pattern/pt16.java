package Pattern;
import java.util.*;
public class pt16 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int st=1;
        int sp=num+1;
        for(int i=1;i<=num;i++){
            int val=1;
            for(int k=1;k<=st;k++){
                System.out.print(val);
                val++;
            }
            for(int k=1;k<=sp;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=st;k++){
                val--;
                System.out.print(val);
            } 
            if(i<=num-1){
                st++;
                sp-=2;
                if(sp<0){
                    sp=0;
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int k=1;k<=(2*num)-1;k++){
            if(k<=num){
                System.out.print(k);
            }else{
                System.out.print((2*num)-k);
            }
        } 
    }
}
