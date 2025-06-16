package Pattern;
import java.util.*;
public class pt20 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==1||j==num||(i+j==num+1&&i>=(num+1)/2)||(i==j&&i>=(num+1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
