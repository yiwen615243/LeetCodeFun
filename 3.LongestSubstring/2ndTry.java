class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0, ans = 0;
        
        while(start < s.length() && end < s.length()){
            if(set.contains(s.charAt(end)) == false){
                set.add(s.charAt(end));
                end++;
                ans = Math.max(ans,end-start);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        
        return ans;
    }
}
