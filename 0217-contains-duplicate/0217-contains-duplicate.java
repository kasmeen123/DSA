class Solution {
    public boolean containsDuplicate(int[] nums) {

        // TC: O(N(log(N))
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length-1; i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;

        // TC: O(N)
        HashSet <Integer> set = new HashSet <> ();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        return set.size() == nums.length ? false : true;
    }
}