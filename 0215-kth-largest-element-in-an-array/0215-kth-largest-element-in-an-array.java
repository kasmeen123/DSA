class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        return nums[nums.length-k];
//         PriortyQueue <Integer> pq = new PriorityQueue <> ();
//         for(int i = 0; i < nums.length; i++){
            
//         }
    }
}