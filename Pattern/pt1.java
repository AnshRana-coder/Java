package Pattern;
import java.util.Scanner;
public class pt1 {
   

   public static void main(String[] var0) {
      System.out.print("ENter a no.");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      var1.close();

      for(int var3 = 0; var3 <= var2; ++var3) {
         for(int var4 = 0; var4 < var3; ++var4) {
            System.out.print("*");
         }

         System.out.print("\n");
      }

   }
}
