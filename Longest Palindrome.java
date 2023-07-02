class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int oddCount = -1;
        for (int v: count) {
            if (v % 2 != 0) oddCount++;
        }
        return (oddCount > 0) ? s.length() - oddCount: s.length();
    }
}
