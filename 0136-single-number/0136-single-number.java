class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int flag = 0;
            for(int j = 0; j<n; j++){
                if(nums[j] == nums[i]){
                    flag++;
                }
            }
            if(flag == 1){
                return nums[i];
            }
        }
        return -1;
    }
}