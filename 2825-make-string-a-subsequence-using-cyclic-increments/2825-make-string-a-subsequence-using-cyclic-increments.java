class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        
        int i = 0;
        int j = 0;
         while(i < str1.length() && j < str2.length()) {
             int req = str2.charAt(j) - 'a';
             int curr = str1.charAt(i) - 'a';
            if(req == curr || req == (curr+1) % 26) {     
                j++;
            }
             i++;            
         }
        return j == str2.length();
    }
}