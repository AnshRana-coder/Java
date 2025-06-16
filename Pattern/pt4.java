package Pattern;
import java.util.*;
public class pt4 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num;j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
