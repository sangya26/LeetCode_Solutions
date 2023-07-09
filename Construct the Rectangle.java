class Solution {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while(area%width !=0)
            width--;
        int height=area/width;
        return (new int[]{height, width});
    }
}
