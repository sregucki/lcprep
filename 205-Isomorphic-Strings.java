class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length(); // s.length() == t.length()
        int[] sArr = new int[128], tArr = new int[128];
        for (int i = 0; i < n; i++) {
            char currS = s.charAt(i);
            char currT = t.charAt(i);
            if (sArr[currS] != 0 && sArr[currS] != currT || tArr[currT] != 0 && tArr[currT] != currS) {
                return false;
            }
            sArr[currS] = currT;
            tArr[currT] = currS;
        }
        return true;
    }
}