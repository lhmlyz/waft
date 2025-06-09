package dsa;

// to compile javac ./dsa/AplusB.java
// to run java dsa.AplusB 3 5
public class AplusB {
    public static void main(String... args) {
        int[] nums = { 1, 3, 4, 5, 6 };
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int a = nums[i] + nums[j];
                if (a == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}
