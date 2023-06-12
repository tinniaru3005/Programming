class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] result = new Long[2];
        
        long gcdValue = gcd(A, B);
        result[1] = gcdValue;
        
        long lcmValue = (A * B) / gcdValue;
        result[0] = lcmValue;
        
        return result;
    }
    
    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        
        return gcd(b, a % b);
    }
};
