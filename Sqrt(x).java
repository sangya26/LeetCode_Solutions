class Solution {
    public int mySqrt(int x) {
        /*int n=0;
        if(x > 0){
            n = ((int)(Math.pow(x,0.5)));
        }
        return n;*/
        
        int left = 1;
        int right = x;
        while (left <= right){
            
            int mid = left + (right - left) / 2;
            
            if (mid > x / mid){
                right = mid - 1;
            } 
            else{
                left = mid + 1;
            } 
        }
        
        return right;
    }
}
