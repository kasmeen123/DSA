class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        HashSet <Integer> set = new HashSet <> ();
        for(int i = 0; i < banned.length; i++) {
            set.add(banned[i]);
        }
        int cnt = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(!set.contains(i) && (sum+i) <= maxSum) {
                cnt++;
                sum += i;
            }
        }
        return cnt;
    }
}