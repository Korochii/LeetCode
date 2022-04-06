class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n) for this approach, O(n^2) for bruteforce
        HashMap<Integer, Integer> valIdxPair = new HashMap<>();
        int[] result = new int[2]; // Enough space for 2 int
        for (int i = 0; i < nums.length; i++) {
            int needVal = target - nums[i];
            if (!valIdxPair.containsKey(needVal)) {
                valIdxPair.put(nums[i], i);
            } else {
                result[0] = i;
                result[1] = valIdxPair.get(needVal); // Can modify this part for early termination
            }
        }
        return result;
    }
}

