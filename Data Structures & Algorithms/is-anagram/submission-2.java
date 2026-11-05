class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCharCounts = getCharCounts(s);
        int[] tCharCounts = getCharCounts(t);
        return Arrays.equals(sCharCounts, tCharCounts);
    }

    private int[] getCharCounts(String str) {
        int[] counts = new int[26];
        for (char ch : str.toCharArray()) {
            counts[ch - 'a']++;
        }

        return counts;
    }
}
