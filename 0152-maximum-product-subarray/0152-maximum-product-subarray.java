class Solution {
    public int maxProduct(int[] nums) {
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=i;j<nums.length;j++){
                sum*=nums[j];
                maxsum=Math.max(maxsum,sum);
        }
        }
        return maxsum;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna