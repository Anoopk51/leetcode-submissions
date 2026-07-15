class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);
        int min = Math.min(sumOdd , sumEven);
        // int gcd =1;
        // for(int i=1 ; i<(min/2) ;i++){
        //     if(min%i==0){
        //         gcd = i;
        //     }
        // }
        // return gcd;

        while(sumEven!=0){
            int temp = sumEven;
            sumEven = sumOdd % sumEven;
            sumOdd = temp;
        }
        return sumOdd;
    }
}