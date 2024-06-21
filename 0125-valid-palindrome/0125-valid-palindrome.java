class Solution {
    public boolean isPalindrome(String s) {
     String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Reverse the cleaned string
        String reversed = new StringBuilder(cleanedString).reverse().toString();
        // Compare the cleaned string with its reversed version
        return cleanedString.equals(reversed);
        }
}