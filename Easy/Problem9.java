package Easy;

class Problem9
{
    public boolean isPalindrome(int x)
    {
        if(x<0 || (x%10==0 && x!=0))
        {
            return false;
            
        }
        int reversednumber=0;
        while(x> reversednumber)
        {
            reversednumber= reversednumber * 10 + x % 10;
            x /= 10;
            
        }
        return x == reversednumber || x == reversednumber/10;
        
    }
}
// Palindrome Number