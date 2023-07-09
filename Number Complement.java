class Solution {
    public int findComplement(int num) {
        int n=0;
        n=(int)(Math.log(num)/Math.log(2));
        num=~num;
        num= num & (int)((Math.pow(2,n))-1);
        return num;
    }
}
