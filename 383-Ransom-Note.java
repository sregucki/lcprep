class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] r = new int[128], m = new int[128];
        for (int i = 0; i < magazine.length(); i++) {
            m[magazine.charAt(i)]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            r[c.charAt(i)]++;
            if (r[c.charAt(i)] > m[c.charAt(i)]) {
                return false;
            }
        }
        return true;
    }
}