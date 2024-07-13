class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        long res = 1;
        long count = 1;
        int starting = -1;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] == 1) {
                starting = i;
                break;
            }
        }
        if (starting == -1) return 0;
        for (int i = starting;i < nums.length;i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                res *= count;
                res %= 1000000007;
                count = 1;
            }
        }
        return (int)res;
    }
}