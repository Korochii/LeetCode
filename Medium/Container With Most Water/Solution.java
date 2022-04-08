class Solution {
    public int maxArea(int[] height) {
        // Brute-force: O(n^2)
        /*int result = 0;
        for (int i = 0; i < height.length;i++) {
            for (int j = i; j < height.length; j++) {
                int currSize = Math.min(height[i], height[j]) * (j - i);
                if (currSize > result) {
                    result = currSize;
                }
            }
        }
        return result;
        */
        // https://leetcode.com/problems/container-with-most-water/discuss/1915172/JavaC%2B%2B-Easiest-Explanations
        // Two pointers: O(n)
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}
