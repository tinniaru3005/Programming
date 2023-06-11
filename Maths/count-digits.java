//Given a number N. Count the number of digits in N which evenly divides N.

class Solution{
    static int evenlyDivides(int N){
        // code here
        int num = N;
        int count = 0;
        
        while(num!=0) {
            int digit = num%10;
            
            if (digit != 0 && N % digit == 0) {
                count++;
            }
            num /= 10;
        }
        
        return count;
    }
}
