class Solution {
    public void sortColors(int[] nums) {
        int zeroCount =0;
        int oneCount=0;
        int twoCount=0;
        for(int values : nums){
            if(values==0){
                zeroCount++;
            }else if(values==1){
                oneCount++;
            }else{
                twoCount++;
            }
            int index= 0;
            for(int count=0;count<zeroCount;count++){
                nums[index]=0;
                index++;
            }
            for(int count=0;count<oneCount;count++){
                nums[index]=1;
                index++;
            }
            for(int count=0;count<twoCount;count++){
                nums[index]=2;
                index++;
            }
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna