package Medium;

class  Problem122 {
    public int maxProfit(int[] prices) {
        int pmax=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                pmax+=(prices[i]-prices[i-1]);
        }
        return pmax;
    }
}