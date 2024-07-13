class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map1 = new HashMap<>();
        String[] words = s.split(\ \);
        if (words.length != pattern.length()) {
            return false;
        }
        int n = words.length;
        for (int i = 0; i < n; i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c) && !map.get(c).equals(word) || map1.containsKey(word) && map1.get(word) != c) {
                return false;
            }
            map.put(c, word);
            map1.put(word, c);
        }
        return true;
    }
}