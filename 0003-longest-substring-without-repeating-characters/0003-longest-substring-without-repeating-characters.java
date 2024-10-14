class Solution {
    public int lengthOfLongestSubstring(String s) {
       
               HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;  
        int start = 0;  

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar) && map.get(currentChar) >= start) {
                start = map.get(currentChar) + 1;
            }

            map.put(currentChar, i);

            max = Math.max(max, i - start + 1);
        }

        return max;

    }
}
