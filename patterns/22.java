/*
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/

class Solution {
    void printSquare(int n) {
        // code here
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,bottom), Math.min(left,right))+" ");
            }
            System.out.println();
        }
    }
}
