class Solution {
    public int reverse(int x) {
        int result = 0;
        int num = 0;
        while(x != 0){
            num = x % 10;
            x = x / 10;

            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && num > 7)){
                return 0;
            }if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && num < -8)){
                return 0;
            }

            result = result*10 + num;
        }
    return result;
    }
}