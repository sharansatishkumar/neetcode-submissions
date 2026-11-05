class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            int[] charCount = new int[26];
            for (char ch : str.toCharArray()) {
                charCount[ch - 'a']++;
            }

            String key = Arrays.toString(charCount);
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }

            anagrams.get(key).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
