class Solution {
    public int search(int[] nums, int target) {
        // TC: O(N)
        // int index = -1;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target) index = i;
        // }
        // return index;

        // TC: log(N)
        int pivot = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
             pivot = i;
            break;
            }
        }
        int l1 = 0;
        int r1 = (pivot == -1) ? nums.length - 1 : pivot;
        while(l1 <= r1){
            int mid1 = (l1+r1)/2;
            if(nums[mid1] == target) return mid1;
            else if(nums[mid1] > target) r1 = mid1-1;
            else l1 = mid1+1;
        }

        int l2 = (pivot == -1) ? nums.length : pivot + 1;
        int r2 = nums.length-1;
        while(l2 <= r2){
            int mid2 = (l2+r2)/2;
            if(nums[mid2] == target) return mid2;
            else if(nums[mid2] > target) r2 = mid2-1;
            else l2 = mid2+1;
        }
         return -1;  
    }
}