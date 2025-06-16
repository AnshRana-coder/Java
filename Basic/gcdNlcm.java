package Basic;
import java.util.*;
public class gcdNlcm {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int o1=n1;
        int o2=n2;
        scn.close();
        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        int lcm=(o1*o2)/gcd;
        System.out.print("GXD is"+gcd+"and LCM is :"+lcm);

    }
}
