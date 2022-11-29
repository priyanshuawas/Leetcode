package Easy;

class Problem69 {
    public int mySqrt(int x) {
        long l=0,r=x,res=0;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(mid*mid<x) {
                l=mid+1; 
                res=mid;
            }
            else if(mid*mid>x) r=mid-1;
            else return (int)mid;
        }
        return (int)res;
    }
}