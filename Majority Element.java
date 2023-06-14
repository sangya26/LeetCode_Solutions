class Solution {
    public int majorityElement(int[] nums) {
        int count=0, mele=0;
        for(int num: nums){
            if(count==0)
                mele=num;
            if(num==mele)
                count++;
            else
                count--;
        }
        return mele;
    }
}
