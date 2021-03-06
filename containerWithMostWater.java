class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
		return 0;
	}
        int left  = 0;
        int right = height.length -1;
        int area=0;
        while(left<right){            
            area= Math.max(area,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return area;
    }
}