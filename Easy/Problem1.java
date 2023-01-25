package Easy;

import java.util.HashMap;
import java.util.Map;

class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map map = new HashMap();
        for(int i=0; i<nums.length;i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }
            else
            {
                ans[1]= i;
                ans[0]= (int)map.get(target-nums[i]);
                return ans;
            }
        }
        return ans;
    }
}