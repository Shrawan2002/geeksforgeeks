class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList <>();

        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                list.add(nums[i]);
            }
        }
     // number of non - zero elements
        int nz = list.size();
        for(int i = 0; i<nz; i++){
            nums[i] = list.get(i);
        }
        for(int i = nz; i<n; i++){
            nums[i] = 0;
        }
    }
}