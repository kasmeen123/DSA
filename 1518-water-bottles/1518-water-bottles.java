class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int drink = numBottles;
        int emptyBottles = numBottles;
        
        while(emptyBottles >= numExchange){
            int newBottles = emptyBottles / numExchange;
            drink += newBottles;
            emptyBottles = emptyBottles % numExchange + newBottles;
        }
     return drink;
    }
}