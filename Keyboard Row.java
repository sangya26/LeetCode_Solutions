class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();

        for (String word : words) {
            int row = -1;
            boolean isValid = true;
            for (char c : word.toLowerCase().toCharArray()) {
                int foundRow = -1;
                for (int i = 0; i < rows.length; i++) {
                    if (rows[i].indexOf(c) != -1) {
                        foundRow = i;
                        break;
                    }
                }

                // Checking if the character belongs to a different row or not found
                if (foundRow == -1 || (row != -1 && row != foundRow)) {
                    isValid = false;
                    break;
                } else {
                    row = foundRow;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}
