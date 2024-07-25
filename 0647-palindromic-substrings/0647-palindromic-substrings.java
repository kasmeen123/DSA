class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                String subString = s.substring(i, j);
                if(palindrome(subString)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public boolean palindrome(String string) {
        int left = 0;
        int right = string.length() - 1;
        while(left <= right){
            if(string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}