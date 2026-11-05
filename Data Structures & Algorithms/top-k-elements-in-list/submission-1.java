class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = getCounts(nums);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(counts.get(a), counts.get(b)));
        for (int val : counts.keySet()) {
            minHeap.add(val);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = minHeap.poll();
        }

        return topK;
    }

    private Map<Integer, Integer> getCounts(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);
        }

        return counts;
    }
}
