package leetcode;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        boolean flag = true;
        HashMap<Integer, Integer> NumberIndex = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            NumberIndex.put(nums[i], i);
        }
        System.out.println(NumberIndex);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int m = nums[i];
                int l = nums[j];
                if (m + l == target) {
                    flag = false;
                    result[0] = i;
                    result[1] = NumberIndex.get(nums[j]);
                    if (flag == false) {
                        i = n;
                        j = n;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Index1: " + result[0] + ", Index2: " + result[1]);
    }
}
