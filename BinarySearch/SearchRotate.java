package BinarySearch;

public class SearchRotate {
    public static void main(String[] args) {
        //optimal soln is do it by binary search
        int [] arr = {4,5,6,7,0,1,2};
        int n = arr.length;
        int target = 0;
        int low  = 0;
        int high = n - 1;

        while (low <= high) {

    int mid = low + (high - low) / 2;

    if (arr[mid] == target) {
        System.out.println(mid);
        return;
    }

    // Left half is sorted
    if (arr[low] <= arr[mid]) {
        if (target >= arr[low] && target < arr[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    // Right half is sorted
    else {
        if (target > arr[mid] && target <= arr[high]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
}

System.out.println(-1);


        //brute force and better soln of this 
//         int [] nums  = {4,5,6,7,0,1,2};
//         int k = -1;
//         int target = 0;
//         int n = nums.length;

//         for(int i = 0; i < n;i++){
//             if(nums[i] > nums[i+1]){
//                 k = i;
//                 break;
//             }
//         }

//         for(int i = 0; i < k;i++){//reverse the left part
//             int low = 0;
//             int high = k - 1;
//             while(low < high){
//                 int temp = nums[low];
//                 nums[low] = nums[high];
//                 nums[high] = temp;
//                 low++;
//                 high--;
//             }
//         }
//         for(int i = n-k; i < n;i++){//reverse the right part
//             int low = n-k;
//             int high = n-1;
//             while(low < high){
//                 int temp = nums[low];
//                 nums[low] = nums[high];
//                 nums[high] = temp;
//                 low++;
//                 high--;
//             }
//         }
//         for(int i = 0; i < n;i++){//reverse the whole arr for ascending order may not be jaruri
//             int low = 0;
//             int high = n-1;
//             while(low < high){
//                 int temp = nums[low];
//                 nums[low] = nums[high];
//                 nums[high] = temp;
//                 low++;
//                 high--;
//             }
//         }

//         int left = 0;
//         int right = n - 1;

//         while(left<=right){
//             int mid = left + (right - left)/2;

//             if(nums[mid] == target){
//                 System.out.println("The index of the target in rotated sorted array is:"+(mid+k+1));
//                 return;
//             }
//             else if(nums[mid] < target){
//                 left = mid + 1;
//             }
//             else {
//                 right = mid - 1;
//             }
//         }   
//     }
// }
    }
}
