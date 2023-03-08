package leetcode.easy;

public class BinarySearch {
    /**
     * https://leetcode.com/problems/binary-search/description/
     * 704. Binary Search
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     *
     * Example 1:
     *
     * Input: nums = [-1,0,3,5,9,12], target = 9
     * Output: 4
     * Explanation: 9 exists in nums and its index is 4
     *
     *         int [] nums = new int[] {-1,0,3,5,9,12};
     *         int target = 9;
     *         System.out.println(search(nums,target));
     */
    public static int search(int[] nums, int target) {
        int max = nums.length - 1;
        int min = 0;
        while(min<=max){
            int index = (max + min)/2;
            if(nums[index] < target) {
                min=index+1;
            }
            else if(nums[index] > target) {
                max=index-1;
            }
            else
                return index;
        }
        return -1;
    }
}
