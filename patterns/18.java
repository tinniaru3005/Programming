/*
E
E D
E D C
E D C B
E D C B A
*/

class Solution {
    void printTriangle(int n) {
        // code here
        for(int i=n;i>=1;i--){
            //char
            for(int j=n;j>=i;j--){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
