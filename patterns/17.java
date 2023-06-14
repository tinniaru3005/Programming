/*
   A
  ABA
 ABCBA
ABCDCBA
*/

class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //char
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            //char
            for(int j=i-1;j>=1;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
