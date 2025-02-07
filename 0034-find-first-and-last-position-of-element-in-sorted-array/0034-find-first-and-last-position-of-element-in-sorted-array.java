class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstOcc = -1;
        int lastOcc = -1;

        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                if(firstOcc == -1){
                    firstOcc = i;
                }
                lastOcc = i; 
            }
        }
        return new int []{firstOcc, lastOcc};
    }
}