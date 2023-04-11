package Medium;
public class Problem27 {
    public int Hindex(int [] citrations){
        int len = citrations.length;
        for(int i=0; i<len; i++){
            if(len-i <= citrations[i]){
                return len-i;
            }
        }
        return 0;

    }
    
}
