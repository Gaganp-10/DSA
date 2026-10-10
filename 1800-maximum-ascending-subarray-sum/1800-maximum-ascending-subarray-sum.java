class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[j-1]){
                    sum+=nums[j];
                    maxsum=Math.max(maxsum,sum);
                }else{
                    break;
            }
        }
        maxsum=Math.max(maxsum,sum);

    }
    return maxsum;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna