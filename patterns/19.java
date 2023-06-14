/*
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

class Solution {
    void printTriangle(int n) {
        // code here
        //1
        for(int i=1;i<=n;i++){
            //stars
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            //space
            for(int j=2;j<=i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //2
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
