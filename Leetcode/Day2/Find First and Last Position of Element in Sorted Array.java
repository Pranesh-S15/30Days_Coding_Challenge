class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1}; 

        if (nums.length == 0) {
            return arr;
        }
        boolean test = false;
        for (int num : nums) {
            if (num == target) {
                test = true;
                break;
            }
        }

        if (!test) {
            return arr;
        }
         int x = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                x = i;
                break;
            }
        }
        int y = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                y = i;
                break;
            }
        }

        arr[0] = x;
        arr[1] = y;
        return arr;
    }
}
