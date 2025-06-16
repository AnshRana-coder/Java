package Basic;
import java.util.*;
public class inverseNo {
    public static void main(String[] args){;
        System.out.print("Enter a no");
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int inv = 0;
        int pos = 1;
        while (n > 0) {
            int x = n % 10;
            int id = pos;
            inv = inv + id * (int) Math.pow(10, x - 1);
            n = n / 10;
            pos++;
        }
        System.out.println(inv);
        scn.close();
    }
}
    