package Medium;
class Solution {
    public int[][] merge(int[][] interval) {
        Arrays.sort(interval,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        int[] current=interval[0];
        list.add(current);
        for(int[] next:interval){
            if(current[1]>=next[0]){
                current[1]=Math.max(current[1],next[1]);
            }
            else {
                current=next;
                list.add(current);
            }
        }
        return list.toArray(new int[list.size()][]);
        } 
    }
