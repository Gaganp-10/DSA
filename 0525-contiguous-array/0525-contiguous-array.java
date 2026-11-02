class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> one = new HashMap<>();
        int max=0;
        int sum=0;
        one.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum--;
            }else{
                sum++;
            }
            if(one.containsKey(sum)){
                max=Math.max(max,i-one.get(sum));
            }else{
                one.put(sum,i);
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna