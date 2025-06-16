package Pattern;
import java.util.*;
public class pt17 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int st=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num/2;j++){
                if(i==(num+1)/2){
                   System.out.print("*"); 
                }else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=st;k++){
                System.out.print("*");
            }
                
            if(i<=num/2){
                st++;
            }else{
                st--;
            }
            
            System.out.println();
        }
    }
}
