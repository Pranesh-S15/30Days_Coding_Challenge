class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq=new int[1001];
        int n=nums.length;
        int target=0;
        int maxOccur=Integer.MIN_VALUE;
        //freq of elements occur after key
        for(int i=0;i<n-1;i++){
            if(nums[i]==key){
               freq[nums[i+1]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxOccur){
                target=i;
                maxOccur=freq[i];
            }
        }
        return target;
    }
}