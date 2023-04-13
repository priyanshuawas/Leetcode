package Medium;
class Problem238 {
    public int[] productExceptSelf(int[] nums) {
        int []a = new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++){
            a[i]=p;
            p=p*nums[i];
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]=a[i]*p;
            p=p*nums[i];
        }
        return a;
    }
}
