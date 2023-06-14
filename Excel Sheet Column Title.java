class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            char c=(char)(columnNumber%26+'A');
            columnNumber/=26;
            result.append(c);
        }
        result.reverse();
        return result.toString();
    }
}

////////////////////////////////////////////////////////////
class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber > 0) {
            columnNumber--;
            result = (char)('A' + (columnNumber % 26)) + result;
            columnNumber = columnNumber / 26;
        }
        return result;
    }
}
