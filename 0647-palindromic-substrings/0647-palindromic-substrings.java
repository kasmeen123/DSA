class Solution {
    public int countSubstrings(String s) {
//         int n = s.length();
//         int cnt = 0;
//         for(int i = 0; i < n; i++){
//             for(int j = i+1; j <= n; j++){
//                 String subString = s.substring(i, j);
//                 if(palindrome(subString)){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
    
//     public boolean palindrome(String string) {
//         int left = 0;
//         int right = string.length() - 1;
//         while(left <= right){
//             if(string.charAt(left) != string.charAt(right)){
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
        
         int cnt = 0;
    int n = s.length();
    for (int i = 0; i < n; i++) {
        // FOR ODD LENGTH PALINDROME
        int l = i;
        int r = i;
        while (l >= 0 && r < n) {
            if (s.charAt(l) == s.charAt(r)) {
                cnt++;
                l--;
                r++;
            } else {
                break; // Added break to exit the loop when characters don't match
            }
        }
        // FOR EVEN LENGTH PALINDROME
        l = i;
        r = i + 1;
        while (l >= 0 && r < n) {
            if (s.charAt(l) == s.charAt(r)) {
                cnt++;
                l--;
                r++;
            } else {
                break; // Added break to exit the loop when characters don't match
            }
        }
    }
    return cnt;
    }
}