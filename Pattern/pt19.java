package Pattern;
import java.util.*;
public class pt19 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((i==1&&j<=(num+1)/2)||(i==num&&j>=(num+1)/2)||j==(num+1)/2||(i==(num+1)/2)||(j==1&&i>=(num+1)/2)||(j==num&&i<=(num+1)/2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
