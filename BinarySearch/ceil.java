package BinarySearch;

public class ceil {
    public static void main(String[] args) {
        
    int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int target = 5;

        int low = 0;
        int high = n - 1;

        int floor = -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] <= target){//lower bound
                floor = arr[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(floor);
    }
}
