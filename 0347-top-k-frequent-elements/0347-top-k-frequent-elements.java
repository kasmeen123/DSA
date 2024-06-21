class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        //SORTING USING PRIORITY QUEUE
        PriorityQueue <Map.Entry <Integer, Integer>> pq = new PriorityQueue <> (
            (a,b) -> b.getValue() - a.getValue());
            pq.addAll(map.entrySet());

        //SORTING USING LIST
        // List <Map.Entry<Integer, Integer>> list = new ArrayList <> (map.entrySet());
        //     list.sort((a,b) -> b.getValue() -a.getValue());

            int [] ans = new int [k];
            for(int i = 0; i < k; i++){
               ans[i] = pq.poll().getKey();
            // ans[i] = list.get(i).getKey();
            }
        return ans;
    }
}