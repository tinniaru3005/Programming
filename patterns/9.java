/*
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/

class Solution {
    void printDiamond(int n) {
        // Your code here
        for(int i=1;i<=n;i++){
            //space
            for(int j=n-1;j>i-1;j--){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // System.out.println();
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int k=n;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
