
import java.util.*;

public class subtract {

    public static void subtract(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];  // result has the same length as the larger number
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = res.length - 1;

        int borrow = 0;

        while (k >= 0) {
            int v1 = arr1[i];
            int v2 = (j >= 0) ? arr2[j] : 0;

            v1 = v1 + borrow;

            int diff;
            if (v1 >= v2) {
                diff = v1 - v2;
                borrow = 0;
            } else {
                diff = (v1 + 10) - v2;
                borrow = -1;
            }

            res[k] = diff;

            i--; j--; k--;
        }

        // Print result, skipping leading 0s
        int idx = 0;
        while (idx < res.length && res[idx] == 0) {
            idx++;
        }

        if (idx == res.length) {
            System.out.println("0");  // if result is zero
        } else {
            for (int x = idx; x < res.length; x++) {
                System.out.print(res[x]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size and digits of first (larger) array: ");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }

        System.out.print("Enter size and digits of second (smaller) array: ");
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }

        scn.close();
        System.out.print("Difference: ");
        subtract(arr1, arr2);
    }
}
