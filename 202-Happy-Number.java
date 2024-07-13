class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int tmp = 0;
        while (n != 1) {
            while (n >= 10) {
                tmp += Math.pow(n % 10, 2);
                n /= 10;
            }
            tmp += Math.pow(n, 2);
            n = tmp;
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            tmp = 0;
        }
        return true;
    }
}