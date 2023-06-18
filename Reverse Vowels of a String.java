class Solution {
    public String reverseVowels(String s) {
        List<Character> vowel=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowel.add(s.charAt(i));
            }
        }
        Collections.reverse(vowel);
        int index=0;
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(isVowel(str[i])){
                str[i]=vowel.get(index++);
            }
        }
        return new String(str);
    }
    private static boolean isVowel(char c){
        return c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U';
    }
}
