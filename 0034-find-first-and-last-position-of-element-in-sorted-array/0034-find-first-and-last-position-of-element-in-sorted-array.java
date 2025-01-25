class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstOccu = -1;
        int lastOccu = -1;
        for(int i = 0; i<n; i++){
            if(nums[i] == target){
                if(firstOccu == -1) firstOccu = i;
                lastOccu = i;
            }
        }
        return new int[]{firstOccu, lastOccu};
    }
}