class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0)  return -1;
        int[] store = new int[26];
        for(char ch : s.toCharArray()){
            store[ch - 'a']++;      
        }
        for(int idx = 0; idx < s.length(); idx++){
            if(store[s.charAt(idx) - 'a'] == 1){
                return idx;
            }
        }
        return -1;
    }
}
