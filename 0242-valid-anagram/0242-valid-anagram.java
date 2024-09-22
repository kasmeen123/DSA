class Solution {
    public boolean isAnagram(String s, String t) {
      
    //    if(s.length() != t.length()){
    //        return false;
    //    }
    //    else{
    //        char [] arr1 = s.toCharArray();
    //        char [] arr2 = t.toCharArray();
    //        Arrays.sort(arr1);
    //        Arrays.sort(arr2);
    //        return Arrays.equals(arr1, arr2);
    //    }

  
     if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
           
            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0) {
                return false;
            }
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        return true;
    }
}