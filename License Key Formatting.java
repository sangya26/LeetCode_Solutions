class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len=0;
        StringBuilder result=new StringBuilder();
        int i=s.length()-1;
        s=s.toUpperCase();
        
        while(i>=0){
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))){
                    if(len==k){
                        result.append('-');
                        len=0;
                    }
                    result.append(s.charAt(i));
                    len++;
            }
            i--;
        }
        return result.reverse().toString();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
		       if (s.charAt(i) != '-') {
			        if (sb.length() % (k + 1) == k) {
				         sb.append('-');
			        }
			       sb.append(Character.toUpperCase(s.charAt(i)));
		       }
	     }
	    return sb.reverse().toString(); 
    }
}
	
}
