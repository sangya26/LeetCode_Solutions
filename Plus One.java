class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1] == 9){
            int i = digits.length-1;                       //storing the array last index
            while(i>=0 && digits[i] == 9){           //checking if i is greater than 0 n index value is 9
                digits[i] = 0;                              //storing 0 at that index
                i--;                                      // decreasing the index value
            }
            if(i==-1){                                    // if index value is -1 create a new array
                int[] arr = new int[digits.length+1];
                arr[0] = 1;                               // store 1 at 0 index
                return arr;                               //and return the array
            }
            else{
                digits[i]++;                              //otherwise increase the previous index
                return digits;
            }
        }
        else
            digits[digits.length-1]++;
        return digits;
    }
}
