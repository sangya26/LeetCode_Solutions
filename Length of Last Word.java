class Solution {
    public int lengthOfLastWord(String s) {
        /*int length = 0;
        String str = s.trim();
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                length = 0;
            else
                length++;
        }
 
        return length;*/
        
        s = s.trim();
        String[] str=s.split(" ");
        String lastWord=str[str.length-1];
        return lastWord.length();
    }
}
