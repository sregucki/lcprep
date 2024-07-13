class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sArr = new int[128], tArr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            sArr[s.charAt(i)]++;
            tArr[t.charAt(i)]++;
        }
        return Arrays.equals(sArr, tArr);
    }
}