    //max -min

    import java.util.*;
    public class sum {

        public static void sum(int arr1[],int arr2[]){
            int n=arr1.length;
            int m=arr2.length;
            int[] arr3;
            if(n>m){
                arr3= new int[n+1];
            }else{
                arr3= new int[m+1];
            }
            int i = arr1.length - 1;
            int j = arr2.length - 1;
            int k = arr3.length - 1;

            int carry = 0;

            while (k >= 0) {
                int v1 = (i >= 0) ? arr1[i] : 0;
                int v2 = (j >= 0) ? arr2[j] : 0;

                int sum = v1 + v2 + carry;
                arr3[k] = sum % 10;
                carry = sum / 10;

                i--;
                j--;
                k--;
            }
            for(int b=0;b<arr3.length;b++){
                    System.out.print(arr3[b]);
            }
                
        }
        public static void main(String[] args){
            System.out.print("Enter 2 array size and it value");
            Scanner scn=new Scanner(System.in);
            int num1=scn.nextInt();
            int[] arr1 = new int[num1];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=scn.nextInt();
            }
            int num2=scn.nextInt();
            int[] arr2 = new int[num2];
            for(int i=0;i<arr2.length;i++){
                arr2[i]=scn.nextInt();
            }
            scn.close();
            sum(arr1,arr2);
            
        }
    }
