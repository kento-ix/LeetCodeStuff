/*Exapmle 1
 * input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Eplanation: Because nums[0] + nums[1] == 9, we return [0,1]
 * 
 * Example 2
 * Input: nums = [3,2,4], target = 6
 * Outout [1,2]
 * 
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
