class Solution {
    public int strStr(String haystack, String needle) {
        String s1= "sadbutsad";
        String s2= "sad";
        System.out.println(s1.indexOf(s2));  
        System.out.println(s2.indexOf(s1));
        return haystack.indexOf(needle);   
    }
}