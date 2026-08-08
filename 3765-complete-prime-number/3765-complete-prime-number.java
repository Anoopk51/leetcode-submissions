class Solution {
    public boolean completePrime(int num) {
        if(!checkPrime(num)) return false;

        int prefix = num;
        while(prefix > 0){
            prefix/=10;
            if(!checkPrime(prefix)) return false;
        }

        int suffix = num;
        int div = 10;
        while(div < num){
            suffix = num % div;
            if(!checkPrime(suffix)) return false;
            div *=10;
        }
        return true;
    }

    boolean checkPrime(int num){
        boolean is_prime = true;
        if (num == 1) return false;
        for( int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                is_prime = false;
                return is_prime;
            }
        }
        return is_prime;
    }
}