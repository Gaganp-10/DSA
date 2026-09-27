class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = 0;
        for(int i = 0;i<n;i++){
            result =  nums[n/2];
        }

        return result;
        
    }
}