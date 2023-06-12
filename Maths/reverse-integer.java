class Solution {
    public int reverse(int x) {
        int num=x, revnum=0;
        while(num!=0){
            int lastdigit = num%10;
            // Checking for overflow before updating the reversed number
            if (revnum > Integer.MAX_VALUE/10 || (revnum == Integer.MAX_VALUE/10 && lastdigit > 7))
                return 0;
            
            // Checking for underflow before updating the reversed number
            if (revnum < Integer.MIN_VALUE/10 || (revnum == Integer.MIN_VALUE/10 && lastdigit < -8))
                return 0;
            revnum = revnum*10+lastdigit;
            num = num/10;
        }
        return revnum;
    }
}
