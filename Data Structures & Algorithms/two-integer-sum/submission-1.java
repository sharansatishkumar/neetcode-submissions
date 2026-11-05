class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (valToIndex.containsKey(remaining)) {
                return new int[]{valToIndex.get(remaining), i};
            }
            valToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found!");
    }
}
