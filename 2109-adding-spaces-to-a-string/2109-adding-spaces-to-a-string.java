class Solution {
    public String addSpaces(String s, int[] spaces) {
      
        int index = 0;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(index < spaces.length && i == spaces[index]) {
                ans.append(" ");
                index++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}