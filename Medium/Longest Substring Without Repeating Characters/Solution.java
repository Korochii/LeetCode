class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute-force: O(n^3)
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String currStr = "" + s.charAt(i);
            int temp = 1;
            int j = i + 1;
            boolean flag = true;
            while (flag && j < s.length()) {
                if (!currStr.contains("" + s.charAt(j))) {
                    currStr += s.charAt(j);
                    temp++;
                } else {
                    flag = false;
                    break;
                }
                j++;
            }    
            if (temp > result) {
                result = temp;
            }
        }
        return result;
        
    }
}

