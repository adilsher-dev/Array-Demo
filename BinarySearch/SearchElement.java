package BinarySearch;

public class SearchElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;

        int target = 5;
        int low = 0;
        int high = n - 1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                System.out.println("The target at the index:"+mid);
                return;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
