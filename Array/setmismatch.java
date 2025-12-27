public class setmismatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length ;
        int x = -1;

        boolean [] arr = new boolean[n+1];

        for(int i = 0;i<n;i++){
            if(arr[nums[i]]){
                x = nums[i];
            }else{
                arr[nums[i]]=true;
            }
        }
        int y=-1;
        for(int i = 1;i<arr.length;i++){
            if(!arr[i]){
                y=i;
                break;
            }
        }
        return new int[]{x, y};
        
    }
}
