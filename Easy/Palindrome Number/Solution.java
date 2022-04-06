class Solution {
    public boolean isPalindrome(int x) {
        // Should be O(n) where n is the number of digits in x
        int input = x;
        if (x < 0) {
            return false; // -ve numbers doesnt work
        } else if (x >= 0 && x <= 9) {
            return true; // all single digits are palindromes
        }
        
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return input == reversed;
    }
}

