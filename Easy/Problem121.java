package Easy;

class Problem121{
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int pmax=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            pmax=Math.max(pmax,(prices[i]-buy));
        }
        return pmax;
    }
}