//Brute Force Power :X

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j <= s.length(); j++){
                if(unique(s, i, j)) ans = Math.max(ans, j-i);
            }
        }
        return ans;
    }
    
    public boolean unique(String s, int start, int end){
        Set<Character> set = new HashSet<Character>();
        for(int i = start; i < end; i++){
            Character c = s.charAt(i);
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}

