import java.util.Scanner;

public class moveZeros {
    public static void moveZeroes(int[] nums) {
        int last = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[last];
                nums[last] = nums[i];
                nums[i] = temp;
                last++;
            }
        }
    }
    public static void main(String[] args){
        System.out.print("Enter an array size and it value");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        scn.close();
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }        
    }
}
