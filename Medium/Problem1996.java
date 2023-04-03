package Medium;

import java.util.Arrays;

class Problem1996 {
    public int numberOfWeakCharacters(int[][] properties) {
        
        Arrays.sort(properties,(a,b)->(a[0] == b[0])?b[1]-a[1]:a[0]-b[0]);
        int n = properties.length;
        int max = properties[n-1][1];
        int ans = 0;
        for(int i = n-2;i >= 0; i--){
            if(properties[i][1]<max) ans++;
            
            else
            max = properties[i][1];  
        }
        return ans; 
    }
}