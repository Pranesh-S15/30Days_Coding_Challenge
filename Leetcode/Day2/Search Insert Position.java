class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(target>nums[nums.length-1]){
                index=nums.length;
            }
            else if(target==nums[i]){
                index=i;
                break;
            }
            else if(target<nums[i]){
                index=i;
                break;
            }
           
        }
        return index;
        
    }
}