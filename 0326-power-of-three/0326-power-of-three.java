class Solution {
    public boolean isPowerOfThree(int n) {
        boolean powOfThree = true;
        if (n<1  ){ return false;}
        else if (n == 1){ return true;}
        // int num = Math.sqrt((int)(n));
        int num = n;
       
        while (num > 3){
            if  (num%3 == 0){
                num /= 3;
                // powOfThree = true;
            }else{
            return false;
            }
         }
         if (num <3) {powOfThree = false;}
        return powOfThree;
    }
}