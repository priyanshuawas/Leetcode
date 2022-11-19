package Medium;
class Problem7 {
    public int reverse(int x) {
        long revs=0;
        
        while(x!=0){
            revs=revs*10+(x%10);
            x=x/10;
        }
        if(revs > Integer.MAX_VALUE || revs < Integer.MIN_VALUE){
            return 0;
        }
        return (int)revs;
        
        
    }
}