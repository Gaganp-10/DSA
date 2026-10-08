class Solution {
    public int missingMultiple(int[] nums, int k) {
        int max= nums[0];
        for(int num:nums){
            if(num>max){
                max= num;
            }
        }
        for(int i=k;i<=max;i+=k){
            boolean found= false;

            for(int num:nums){
                if(num ==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return ((max/k)+1)*k;

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna