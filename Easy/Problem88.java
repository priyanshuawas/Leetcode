package Easy;

import java.util.Arrays;

class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int counter =0; 
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[counter];
            counter++;
        }
        Arrays.sort(nums1);

    }
}