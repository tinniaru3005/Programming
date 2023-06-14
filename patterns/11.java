/*
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
*/

class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print((j%2)+" ");
            }
            System.out.println();
        }
    }
}
