class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int reverse = 0, num = n;
        String result = "";
        while(num != 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        if(reverse == n){
            result = "Yes";
        } else {
            result = "No";
        }
        return result;
    }
}
