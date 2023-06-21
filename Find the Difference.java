class Solution {
    public char findTheDifference(String s, String t) {
        char ch=0;
        for(char chS : s.toCharArray())
            ch ^=chS;
        for(char chT : t.toCharArray())
            ch ^= chT;
        return ch;
    }
}
