/*
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 
*/

class Solution {
    void printTriangle(int n) {
        // code here
        int k=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                System.out.print(j+" ");
            }
            k--;
            System.out.println();
        }
    }
}
