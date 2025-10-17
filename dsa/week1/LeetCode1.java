public class LeetCode1 {

    void main () {

        // if array is sorted it can be calcul
        int[] nums = {25,3,2,7,11,15};
        int target = 9;

        // brute force
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (target == (nums[i] + nums[j])){
        //             result[0] = i;
        //             result[1] = j;
        //             new int{i, j};
        //         }
        //     }
        // }

        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }

            numToIndex.put(nums[i], i);
        }
    }
}