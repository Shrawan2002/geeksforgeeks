class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstOcc = findFirst(nums, n, target);
        int lastOcc = findLast(nums, n, target);

        return new int []{ firstOcc, lastOcc};
    }

    public static int findFirst(int nums[], int n, int target){
        int idx = -1; 
        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return idx;
    }

        public static int findLast(int nums[], int n, int target){
        int idx = -1; 
        for(int i = n-1; i>=0; i--){
            if(nums[i] == target){
                return i;
            }
        }
        return idx;
    }
}