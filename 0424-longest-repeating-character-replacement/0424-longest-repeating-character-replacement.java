class Solution {
    public int characterReplacement(String s, int k) {
       
        int [] cnt = new int [26];
        int l = 0;
        int maxFreq = 0;
        int maxLength = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            cnt[s.charAt(i) - 'A']++;
            
            maxFreq = Math.max(maxFreq, cnt[s.charAt(i) - 'A']);
            
            if((i-l+1) - maxFreq > k) {
                
                 cnt[s.charAt(l) - 'A']--;
                 l++;
            }
            maxLength = Math.max(maxLength, i-l+1);
        }
       return maxLength;
    }
}
