class NumArray {
    private int[] arr;
    public NumArray(int[] nums) {
        this.arr=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

/////////////////////////////////////////////////////
class NumArray {
    private int[] arr;
    public NumArray(int[] nums) {
        arr=new int[nums.length+1];
        for(int i=1;i<=nums.length;i++){
            arr[i]=arr[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return arr[right+1]-arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */