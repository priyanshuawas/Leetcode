package Easy;
class Problem1422 {
    public int maxScore(String str) {
        int t=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='1')
            {
                t++;

            }
        }
        int maximum=0;
        int l=0;
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)=='0')
            {
                l++;
            }
            else{
                t--;
            }
            if(maximum<(l+t))
            {
                maximum=l+t;
            }
        }
        return maximum;
        
    }
    
}