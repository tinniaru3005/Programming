class Solution {
    static Long reversedBits(Long X) {
        // code here
        long reversed = 0;
        
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            reversed |= (X & 1);
            X >>= 1;
        }
        
        return reversed;
    }
};
