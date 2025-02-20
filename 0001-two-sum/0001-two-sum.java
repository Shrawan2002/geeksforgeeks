class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i<n; i++){
            int num = nums[i];
            int moreNeed = target - num;
            if(mpp.containsKey(moreNeed)){
                ans[0] = mpp.get(moreNeed);
                ans[1] = i;
                return ans;
            }else{
                mpp.put(nums[i], i);
            }
        }
        return ans;
    }
}