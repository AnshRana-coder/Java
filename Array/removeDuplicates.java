import java.util.Scanner;

public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int left = 1;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
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
        int x = removeDuplicates(arr);
        System.out.println(x);

        
    }
}
