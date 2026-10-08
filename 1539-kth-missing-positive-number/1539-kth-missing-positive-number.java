class Solution {
    public int findKthPositive(int[] arr, int k) {
        int nums = arr[arr.length-1];
        int count =0;
        for(int i=1;i<=nums;i++){
            boolean found = false;

            for(int num:arr){
               if(num==i){
                found = true;
                break;
               } 
            }
            if(!found){
                count++;
                if(count==k){
                    return i;
                }
            }
        }
        return nums+(k-count);

        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna