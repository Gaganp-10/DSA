class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> one = new HashSet<>();
        for(int num:nums1){
            one.add(num);
        }
        HashSet<Integer> result=new HashSet<>();
        for(int num:nums2){
            if(one.contains(num)){
                result.add(num);
            }
        }
        int[] arr= new int[result.size()];
        int i=0;
        for(int num:result){
            arr[i++]=num;
        }
        return arr;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna