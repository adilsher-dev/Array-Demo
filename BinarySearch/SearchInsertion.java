package BinarySearch;

public class SearchInsertion {
    public static void main(String[] args) {

    int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int target = 5;

        int low = 0;
        int high = n - 1;

        int ans = n;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] >= target){//lower bound
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}

