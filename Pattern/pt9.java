package Pattern;
import java.util.*;
public class pt9 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==j||i+j==num+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
