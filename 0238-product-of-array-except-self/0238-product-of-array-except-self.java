class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
         if(n == 1) return new int [] {1};
        
        int [] prefix = new int [n];
        int [] postfix = new int [n];
        int [] ans = new int [n]; 
        prefix[0] = nums[0];
        postfix[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            prefix[i] = nums[i]*prefix[i-1];
             
        }
        for(int i = n-2; i >= 0; i--){
            postfix[i] = nums[i]*postfix[i+1];
        }
        ans[0] = postfix[1];
        for(int i = 1; i < n-1; i++){
            ans[i] = prefix[i-1]*postfix[i+1];
        }
        ans[n-1] = prefix[n-2];
        return ans;
    }
}