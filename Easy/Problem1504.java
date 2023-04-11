package Easy;

class Problem1504 {
    public boolean halvesAreAlike(String s) {
        int counts = 0;
        int half = s.length()/2;
        for(int i = 0; i<s.length(); i++){
            if(isVowel(s.charAt(i)))
                counts = (i<half) ? counts+1 : counts-1;
        }
        return (counts==0)?true:false;
    }
    
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        return true;
        return false;

    }
}
