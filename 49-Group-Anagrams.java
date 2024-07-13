class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            String c = countChars(word);
            if (map.containsKey(c)) {
                map.get(c).add(word);
            } else {
                map.put(c, new ArrayList<>(List.of(word)));
            }
        }
        return new ArrayList<>(map.values()); 
    }
    private String countChars(String s) {
        int[] arr = new int[128];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                sb.append(arr[i]).append((char) i).append(\#\);
            }
        }
        return sb.toString();
    }
}