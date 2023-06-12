class Solution{
    static int minJumps(int[] arr){
        // your code here
        if (arr[0] == 0) {
            return -1;
        }
        int i = 0, jump = 0, arrLength = arr.length;
        while(i < arrLength){
            i += arr[i];
            jump++;
            if(i == arrLength-1){
                jump--;
            }
        }
        return jump;
    }
}
