package Stack;
import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        //this is the brute force approach is done by me
//         List<Integer> list = new ArrayList<>();
//         int nums1[] = {2,4};
//         int nums2[] = {1,2,3,4};
//         int n  = nums1.length;
//         int m = nums2.length;

//         for(int i = 0; i < n;i++){
//             for(int j = 0;j < m-1;j++){
//                 int k = -1;
//                 if(nums1[i] == nums2[j]){
//                     k = j;
//                     for(int p = k; p < m;p++){
//                         if(nums2[k] < nums2[p]){
//                             list.add(nums2[p]);
//                             break;
//                         }
//                     }
//                     list.add(-1);
//                 }  
//             }
//         }
//         System.out.println("The given ans is:"+list);
//     }
// }
//lets think about the optimal one
//using stack find nge and using hashmap to store the number with its nge means next greater Element

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mpp = new HashMap<>();

        int nums1[] = {2,4};
        int nums2[] = {1,2,3,4};
        int arr[] = new int[nums1.length+nums2.length];

        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                mpp.put(st.pop(),num);
            }
            st.push(num);
        }

        while(!st.isEmpty()){
            mpp.put(st.pop(),-1);
        }

        int i = 0;

        for(int num : nums1){
            arr[i++] = mpp.get(num);
        }
 
        System.out.print("{");
        for(int j =0; j< i;j++){
            
            System.out.print(+arr[j]+ " ");
        }
        System.out.println("}");
    }
}
