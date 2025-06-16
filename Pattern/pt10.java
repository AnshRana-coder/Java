package Pattern;
import java.util.*;
public class pt10 {
    public static void main(String[] args){
        System.out.print("Enter a NO");
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        int os=num/2;
        int is=-1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=1;j<=is;j++){
                System.out.print(" ");
            }
            if(i!=1&&i!=num)
            System.out.print("*");
            if(i<=num/2){
                is=is+2;
                os--;
            }else{
                is-=2;
                os++;
            }
            System.out.println();
        }
        
    }
}
