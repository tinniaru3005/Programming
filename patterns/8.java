/*
*********
 *******
  *****
   ***
    *
*/

class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=2*(n-i+1)-1;k>=1;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
