class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        
        for(int i =1;i<prices.length;i++){
            for(int j=i-1;j>=0;j--){
                int temp = prices[i]-prices[j];
                diff = Math.max(temp,diff);
            } 
        }
        return diff;
    }
}
