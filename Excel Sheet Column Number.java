class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle == null) 
            return -1;
        int result=0;
        for(char c: columnTitle.toCharArray()){
            result *= 26;
            result += c-'A'+1;
        }
        return result;
    }
}
