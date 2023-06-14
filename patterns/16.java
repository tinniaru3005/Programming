/*
A
BB
CCC
DDDD
EEEEE
*/

class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
