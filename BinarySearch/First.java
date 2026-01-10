package BinarySearch;

public class First{
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int n = nums.length; 
        int target = 8;

        int f = -1;
        int l = -1;
        int count = 0;

        for(int i = 0; i < n;i++){
            if(nums[i] == target){
                count++;
                if(count == 1){
                    f = i;
                }
                else{
                    l = i;
                }
            }
        }
        int [] arr = {f,l};
        System.out.println(arr[0] +" " + arr[1]);
    }
}
