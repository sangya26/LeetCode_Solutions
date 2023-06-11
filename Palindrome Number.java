class Solution {
    public boolean isPalindrome(int x) {
        String result = String.valueOf(x);
        for(int i= 0; i < result.length(); i++){
            if(result.charAt(i) != result.charAt(result.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
