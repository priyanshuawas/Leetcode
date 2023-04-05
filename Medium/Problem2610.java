package Medium;

import java.util.ArrayList;
import java.util.HashMap;

class Problem2610 
{
    public List<List<Integer>> findMatrix(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>();
        boolean[] b = new boolean[nums.length];
        for(int i=0; i<b.length; i++)
        {
            Map<Integer, Boolean> maps = new HashMap<>();
            List<Integer> temp = new ArrayList<>();
            for(int j=i; j<b.length; j++)
            {
                if(b[j] == false)
                {
                    if(maps.get(nums[j]) == null)
                    {
                        maps.put(nums[j], true);
                        b[j] = true;
                        temp.add(nums[j]);
                    }
                }
            }
            if(temp.size()>0)
            {
                list.add(temp);
            }
        }
        return list;
    }
}
