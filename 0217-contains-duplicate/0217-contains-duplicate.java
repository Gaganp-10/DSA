class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> one=new HashSet<>();
        for(int num:nums){
            if(one.contains(num)){
                return true;
            }
            one.add(num);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna