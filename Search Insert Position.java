class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == target){
                index = j;
            }
            else{
                if(j == 0 && nums[j] > target){
                index = 0;
              }
            else if(j == nums.length - 1 && target > nums[j]) {
                index = nums.length;      
              }
             else if(target > nums[j] && target < nums[j+1]) {
                index = j + 1;        
              }
            }
        }
        return index;
    }
}
