class Solution {
    static int convertRomanToInt(char ch){
        switch(ch){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int answer = convertRomanToInt(s.charAt(s.length() - 1));
        for(int i = s.length()-2; i >= 0; i--){
            if(convertRomanToInt(s.charAt(i)) < convertRomanToInt(s.charAt(i+1)))
                answer -= convertRomanToInt(s.charAt(i));
            else
                answer += convertRomanToInt(s.charAt(i));
        }
        return answer;
    }
}
