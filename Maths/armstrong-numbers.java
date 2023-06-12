class Solution {
    static String armstrongNumber(int n){
        // code here
        int cubeSum = 0, num = n;
        String result = "";
        while(num != 0){
            int lastDigit = num % 10;
            cubeSum += Math.pow(lastDigit, 3);
            num /= 10;
        }
        if(cubeSum == n){
            result = "Yes";
        }else{
            result = "No";
        }
        return result;
    }
}
