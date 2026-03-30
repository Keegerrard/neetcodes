class Solution {
    public int maxArea(int[] heights) {
        int container = 0;
        int left = 0, right = heights.length - 1;
        while(left<right){
            int shorter = Math.min(heights[left],heights[right]);
            int diff = right - left;
            int temp = diff * shorter;
            container = Math.max(temp, container);
            if(heights[left]>heights[right])right--;
            else left++;
        }
        return container;
    }
}
