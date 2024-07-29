class Solution {
    public String longestPalindrome(String s) {
        
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = palindromeLength(s, i, i);       // Odd length palindromes
            int len2 = palindromeLength(s, i, i + 1);   // Even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    public int palindromeLength(String s, int l, int r){
        
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            
            l--;
            r++;
        
        }
        return r-l-1;
        }
}