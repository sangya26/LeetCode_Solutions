class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int sum = 0;
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        
        while(aLen >= 0 || bLen >= 0 || sum == 1){
            sum += ((aLen >= 0) ? a.charAt(aLen) - '0' : 0);    //calculating sum n carray of last digit
            sum += ((bLen >= 0) ? b.charAt(bLen) - '0' : 0);
            
            result = (char)(sum % 2 + '0') + result;    // if sum is 1 or 3 add 1
            sum /= 2;
            aLen--;                                                  //moving to next digit
            bLen--;
            
        }
        return result;
    }
}
