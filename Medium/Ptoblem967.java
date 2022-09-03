package Medium;

class Problem967 {
    private void func(int num,int n, int k,Set<Integer> ans) {
    if(n==0) {
        ans.add(num);
        return;
    }
    int dig=num%10;
    if(dig+k<=9){
         func(num*10+dig+k,n-1,k,ans);
    }
    if(dig-k>=0) {
         func(num*10+dig-k,n-1,k,ans);
    }
}
public int[] numsSameConsecDiff(int n, int k) {
     Set<Integer> ans= new HashSet<>();
    
    for(int i=1;i<=9;i++) {
        func(i,n-1,k,ans);
    }
    int res[]= new int[ans.size()];
    int j=0;
    for(int o:ans) {
        res[j++]=o;
    }
    return res;
}
    
    
    
}