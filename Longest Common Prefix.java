class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i = 1; i < strs.length; i++){
            for(int j = result.length(); j >= 0; j--)
                if(strs[i].startsWith(result.substring(0,j)))
                {
                    result = result.substring(0,j);
                    break;
                }
        } 
        return result;
    }
}
