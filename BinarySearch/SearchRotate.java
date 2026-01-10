package BinarySearch;

public class SearchRotate {
    public static void main(String[] args) {
        int [] nums  = {4,5,6,7,0,1,2};
        int k = -1;
        int target = 0;
        int n = nums.length;

        for(int i = 0; i < n;i++){
            if(nums[i] > nums[i+1]){
                k = i;
                break;
            }
        }

        for(int i = 0; i < k;i++){//reverse the left part
            int low = 0;
            int high = k - 1;
            while(low < high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        for(int i = n-k; i < n;i++){//reverse the right part
            int low = n-k;
            int high = n-1;
            while(low < high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }
        for(int i = 0; i < n;i++){//reverse the whole arr for ascending order may not be jaruri
            int low = 0;
            int high = n-1;
            while(low < high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }

        int left = 0;
        int right = n - 1;

        while(left<=right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                System.out.println("The index of the target in rotated sorted array is:"+(mid+k+1));
                return;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }   
    }
}
