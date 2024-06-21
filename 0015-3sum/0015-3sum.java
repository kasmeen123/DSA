class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //TC: O(N^3)
    //    List<List<Integer>> list = new ArrayList <> ();
    //    HashSet <List<Integer>> set = new HashSet <> ();
    //    int n  = nums.length;
    //    for(int i = 0; i < n-2; i++){
    //     for(int j = i+1; j < n-1; j++){
    //         for(int k = j+1; k < n; k++){
    //             if(nums[i]+ nums[j]+ nums[k] == 0){
    //                 List <Integer> currList = new ArrayList <> ();
    //                 currList.add(nums[i]);
    //                 currList.add(nums[j]);
    //                 currList.add(nums[k]);
    //                 Collections.sort(currList);
    //                 set.add(currList);
    //             }
    //         }
    //     }
    //    }
    //    list.addAll(set);
    //    return list;
    int n = nums.length;
    List<List<Integer>> list = new ArrayList <> ();
    HashSet <List<Integer>> set = new HashSet <> ();
    for(int i = 0; i < n-1; i++){
        HashMap <Integer, Integer> map = new HashMap <> ();
        for(int j = i+1; j < n; j++){
            if(map.containsKey(-nums[i]-nums[j])){
                List <Integer> currList = new ArrayList <> ();
                currList.add(nums[i]);
                currList.add(nums[j]);
                currList.add(-nums[i]-nums[j]);
                Collections.sort(currList);
                set.add(currList);
            }
            else{
                map.put(nums[j],1);
            }
        }
    }
    list.addAll(set);
    return list;
    }
}















