package Basic;
import java.util.*;
public class rotateNo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("ENter a no to rotate,:");
        int n= scn.nextInt();
        System.out.print("ENter a no by rotate,:");
        int k= scn.nextInt();
        scn.close();

        int temp =n;
        int nod =0;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        k=k%nod;
        if(k<0){
            k=k+nod;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }else{
                mult=mult*10;
            }
        }
        int q=n/div;
        int r=n%div;
        int rot=r*mult+q;
        System.out.print(rot);
    }
}
