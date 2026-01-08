package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityII {
    public static void main(String[] args) {
        int [] nums = {1,1,1,3,3,2,2,2};
        int n = nums.length;

        int el1 = 0, el2 = 0;
        int count1 = 0, count2 = 0;

        // Phase 1: Find candidates
        for (int num : nums) {
            if (num == el1) {
                count1++;
            } else if (num == el2) {
                count2++;
            } else if (count1 == 0) {
                el1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                el2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == el1) count1++;
            else if (num == el2) count2++;
        }

        List<Integer> list = new ArrayList<>();

        if (count1 > n / 3) list.add(el1);
        if (count2 > n / 3) list.add(el2);

        System.out.println(list);
    }
}