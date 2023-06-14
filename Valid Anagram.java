class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int [] char_seq = new int[26];
        for(int i =0 ; i<s.length();i++){
                char_seq[s.charAt(i)-'a']++;
                char_seq[t.charAt(i)-'a']--;
        }
        for(int i = 0 ; i<char_seq.length ; i++){
            if(char_seq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
