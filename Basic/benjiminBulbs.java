package Basic;
import java.util.*;
public class benjiminBulbs {
    public static void main(String[] args){
        System.out.print("ENter a no.");
        Scanner scn=new Scanner(System.in);
        int num= scn.nextInt();
        scn.close();
        System.out.print("On Bulbs: ");
        for(int i=1;i<=num;i++){      //Nested loop not good for optimisiation ..complexity=n^2
            for(int j=1;j<=i;j++){
                if(i==j*j){
                    System.out.print(i+" ");
                }
            }
        }
    }
    
}
