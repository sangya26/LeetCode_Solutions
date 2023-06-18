class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> first=new HashSet<>();
        Set<Integer> intersect=new HashSet<>();
        for(int num:nums1){
            first.add(num);
        }
        for(int num:nums2){
            if(first.contains(num)){
                intersect.add(num);
            }
        }
        int[] result=new int[intersect.size()];
        int i=0;
        for(int num: intersect){
            result[i++]=num;
        }
        return result;
    }
}
