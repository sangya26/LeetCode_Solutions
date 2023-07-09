class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0, count=0;
        for(int j:nums){
            if(j==0) {
                max1=Math.max(max1,count);
                count=0;
            }
            else count++;
        }
        return Math.max(max1,count);
    }
}
