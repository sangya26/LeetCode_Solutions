class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> wordMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!patternMap.containsKey(c)) {
                if (wordMap.containsKey(word) && wordMap.get(word) != c) {
                    return false;
                }
                patternMap.put(c, word);
                wordMap.put(word, c);
            } else {
                if (!patternMap.get(c).equals(word)) {
                    return false;
                }
            }
        }
        return true;
    }
}
